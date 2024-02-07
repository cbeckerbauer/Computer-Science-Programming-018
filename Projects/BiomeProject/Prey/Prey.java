package club.westcs.biome;

public class Prey extends Animal{

	//Attributes
		public static int preyPopulation = 0; 
	
	//Constructor
		public Prey() {
			super(); // calls the constructor of the parent class
			preyPopulation++;
		}
	
	@Override
	public Animal baby(Animal other) {
		if(other instanceof Prey) {   // Object instanceof Object checks if the two are exactly the same class type
			if(this.gender != other.isGender()) {
				if(rand.nextBoolean()) { // birth rate 
					return new Prey(); 
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
