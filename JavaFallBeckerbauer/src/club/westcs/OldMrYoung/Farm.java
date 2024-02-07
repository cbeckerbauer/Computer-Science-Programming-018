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
		animals = new ArrayList<>();
		song = new ArrayList<>();
		addAnimals();
		makeSong();
	}
	
	//Methods
	
	public void addAnimals() {
		this.animals.add(new BananaKing());
		this.animals.add(new Blue());
		this.animals.add(new Candy());
		this.animals.add(new Charlie());
		this.animals.add(new Frogrus());
		this.animals.add(new GoatSeal());
		this.animals.add(new Liopleuodon());
		this.animals.add(new Pink());
		this.animals.add(new Shrimp());
		this.animals.add(new Starfish());
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
			Animal singer = song.remove(song.size() - 1);
			singer.runSong();
		}
	}
	
}
