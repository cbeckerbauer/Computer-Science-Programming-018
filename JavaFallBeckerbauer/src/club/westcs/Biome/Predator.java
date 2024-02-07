package club.westcs.Biome;

public class Predator extends Animal{

	//Attributes
	
	public static int predatorPopulation = 0;
	
	//Constructor
	
	public Predator() {
		super(); 	//This calls the constructor of the parent class
		predatorPopulation++;
	}
	
	@Override
	public Animal baby(Animal other) {
		if(other instanceof Predator) {		//object instanceof object checks if the two are exactly same class type
			if(this.gender != other.isGender()) {
				if(rand.nextInt(4) == 1) {		//birth rate
					return new Predator();
				}
			}
		}
		return null;
	}
	
	public void predate(Animal other) {
		if(other instanceof Prey && rand.nextBoolean()) {	//predator hunting efficiency
			setHunger(other.getHunger());
			other.setAlive();
			Prey.preyPopulation--;
		}
	}

	@Override
	public Animal life(Animal other, int food) {
		predate(other);
		setLifeSpan();
		stillAlive();
		if(this.alive == false) {
			predatorPopulation--;
			return null;
		}
		return baby(other);
	}

}
