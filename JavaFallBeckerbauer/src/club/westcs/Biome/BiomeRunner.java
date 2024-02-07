package club.westcs.Biome;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BiomeRunner {
	
	public static void printPopulations(int plants) {
		System.out.println("Predators: " + Predator.predatorPopulation);
		System.out.println("Prey: " + Prey.preyPopulation);
		System.out.println("Total Animals: " + Animal.population);
		System.out.println("Plants: " + plants);
		System.out.println();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		//Tools
		ArrayList<Animal> biome = new ArrayList<>();		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		//Set Up Populations
		int pop, plants, predPop;
		
		while(true) {
			try {
				System.out.println("How many animals should be in this biome?");
				pop = Integer.parseInt(scan.nextLine());
				System.out.println("How many plants should be in this biome?");
				plants = Integer.parseInt(scan.nextLine());
				System.out.println("How many predators out of every 100 animals should be in this biome?");
				predPop = Integer.parseInt(scan.nextLine());
				predPop %= 100;
				if(predPop > 0) {
					break;
				}
				
			}
			catch(NumberFormatException e) {
				System.out.println("Please only type numbers...");
			}
		}
		
		//Fill the Biome
		for(int i = 0; i < pop; i++) {
			if(rand.nextInt(101) < predPop) {
				biome.add(new Predator());
			}
			else {
				biome.add(new Prey());
			}
		}
		
		System.out.println("Start Values: ");
		printPopulations(plants);
		
		//Run the simulation
		while(Predator.predatorPopulation > 0 && Prey.preyPopulation > 0) {
			for(int i = 0, curPop = biome.size(); i < biome.size() && i < curPop; i++) {
				Animal randAnimal = biome.get(rand.nextInt(biome.size()));		//picks a random animal
				Animal current = biome.get(i);
				int food = 0;
				if(current instanceof Prey) {
					food = rand.nextInt(21);
					if(food > plants) {
						food = 0;
					}
					else {
						plants -= food;
					}
				}
				Animal baby = current.life(randAnimal, food);
				if(baby != null) {
					biome.add(baby);
				}
				if(current.isAlive() == false) {
					biome.remove(current);
				}
			}
			
			if(plants < 100) {
				plants = 500;
			}
			else if(plants > 20000000) {
				plants = 20000000;
			}
			else {
				plants *= rand.nextInt(5) + 1;
			}
			
			printPopulations(plants);
		}
		
	}
	
}
