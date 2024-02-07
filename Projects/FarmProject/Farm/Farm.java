package club.westcs.OldMrYoung;

import java.util.ArrayList;
import java.util.Random;

public class Farm {
//Attributes
	private Random rand;
	private ArrayList<Animal> animals, song; 
	
//Constructor
	public Farm() {
		rand = new Random();
		animals = new  ArrayList<>();
		song = new ArrayList<>();
		addAnimals();
		makeSong();
	}
	
//Methods
	public void addAnimals() {
		this.animals.add(new Pig());
		this.animals.add(new Horse());
		this.animals.add(new Cow());
		this.animals.add(new Sheep());
		this.animals.add(new Chicken());
		this.animals.add(new Duck());
		this.animals.add(new Goat());
		this.animals.add(new Ox());
		this.animals.add(new Goose());
		this.animals.add(new Fox());
	}
	
	public void makeSong() {
		for(int i = 1; animals.size() > 0; i++) {
			int index = rand.nextInt(animals.size()); 
			Animal temp = animals.remove(index); 
			temp.setNumber(i);
			song.add(temp); 
		}
	}
	
	public void runSong() {
		while(song.size() > 0) {
			Animal singer = song.remove(song.size()-1);
			singer.runSong();
		}
	}
	
}
