package club.westcs.biome;

import java.util.Random;

public abstract class Animal { // abstract means there will never be just an animal 
								//you can also have abstract methods 
									//methods without boddies that will be filled in later
	
	//Attributes
		public static int population = 0;
		protected boolean alive, gender; 
		protected int hunger, lifeSpan;
		protected Random rand; 
	
	//Constructor
		public Animal() {
			rand = new Random();
			population++;
			alive = true;
			gender = rand.nextBoolean();
			hunger = rand.nextInt(51) + 50;
			lifeSpan = rand.nextInt(11) + 10; 
		}
		
	//Methods
		public void stillAlive() {
			this.hunger -= rand.nextInt(6) + 5;
			if(this.alive && (this.hunger <= 0 || this.lifeSpan <= 0)) {
				setAlive();
			}
		}
		
		public boolean isAlive() {
			return alive;
		}

		public void setAlive() {
			if(this.alive) {
				this.alive = false;
				population--;
			}
		}

		public int getHunger() {
			return hunger;
		}

		public void setHunger(int hunger) {
			this.hunger += hunger;
			if(this.hunger > 100) {
				this.hunger = 100; 
			}
		}

		public int getLifeSpan() {
			return lifeSpan;
		}

		public void setLifeSpan() {
			if(this.hunger < 25) {
				this.lifeSpan -= rand.nextInt(3);
			}
			this.lifeSpan--;
		}

		public boolean isGender() {
			return gender;
		}
		
		public abstract Animal baby(Animal other);
		
		
		public abstract Animal life(Animal other, int food); 
	
}
