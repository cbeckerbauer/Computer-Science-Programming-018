package club.westcs.Biome;

public class Prey extends Animal{

	//Attributes
	
	public static int preyPopulation = 0;
	
	//Constructor
	
	public Prey() {
		super(); 	//This calls the constructor of the parent class
		preyPopulation++;
	}
	
	@Override
	public Animal baby(Animal other) {
		if(other instanceof Prey) {		//object instanceof object checks if the two are exactly same class type
			if(this.gender != other.isGender()) {
				if(rand.nextBoolean()) {		//birth rate
					return new Predator();
				}
			}
		}
		return null;
	}

	@Override
	public Animal life(Animal other, int food) {
		setHunger(food);
		setLifeSpan();
		stillAlive();
		if(this.alive == false) {
			preyPopulation--;
			return null;
		}
		return baby(other);
	}

}
