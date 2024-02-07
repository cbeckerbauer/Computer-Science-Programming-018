package club.westcs.NifflerCeciliaB;

import java.util.Random;
import java.util.Scanner;

public class Niffler {

	//Attributes
		/*
		 * Strings
		 * 		petName- the name the user gives to the pet
		 * 		masterName- the name of the user
		 * Objects
		 * 		Scanner- get info from user
		 * 		Random- randomize the start statistics
		 * 		A Dice object for every trick that is not core 
		 * 			core(eat, sleep, restroom)
		 * Boolean
		 * 		Alive- has the pet died?
		 * Int
		 * 		Sleep
		 * 		Eat
		 * 		Restroom
		 * String []
		 * 		Commands- the tricks the pet can do
		 * 				-must have 11 commands
		 * 				- must include eat, sleep, restroom, and test death
		 */
	private String petName;
	private String masterName;
	private Scanner scan;
	private Random rand;
	private boolean alive;
	private int sleep;
	private int eat;
	private int restroom;
	private int happiness;
	private int gold;
	private String pronoun;
	private String[] choices = {"give gold", "run", "steal", "help", "eat", "restroom", "sleep", "test death", "play", "go into the suitcase", "buy", "nothing"};
	private Dice giveGoldDice, runDice, stealDice, helpDice, playDice, goIntoTheSuitcaseDice, buyDice;
	private Stopwatch lifeTime;
	private Stopwatch restroomTime;
	private Stopwatch happyTime;
	//Constructor
		/*
		 * initialize your attributes
		 * don't forget to do the objects first
		 * set the core statistics to a random start value
		 */
	public Niffler() {
		rand = new Random();
		scan = new Scanner(System.in);
		alive = true;
		petName = getPetName();
		masterName = getMasterName();
		sleep = 100;
		eat = 100;
		restroom = 100;
		happiness = 100;
		gold = rand.nextInt(21) + 20;
		pronoun = setPronoun();
		printStats();
		giveGoldDice = new Dice();
		runDice = new Dice();
		stealDice = new Dice();
		helpDice = new Dice();
		playDice = new Dice();
		goIntoTheSuitcaseDice = new Dice();
		buyDice = new Dice();
		lifeTime = new Stopwatch();
		restroomTime = new Stopwatch();
		happyTime = new Stopwatch();
		
	}
	
	//Methods
		/*
		 * #1 live()
		 * 		-while the pet is alive
		 * 			-call getCommand() doCommand() setAlive()
		 * #2 getCommand() 		(See the Norse God)
		 * 			-call printCommands()	(print every String in the commands array) 		(Array Notes)
		 * 			-ask the user what command they want the pet to do
		 * 			-return the command the user types
		 * #3 doCommand(String command)  	(See Norse God)
		 * 				-run a method for the command that the user has called
		 * 				-call loseStats()
		 * #4 printCommands()			(Array Notes)
		 * 			-Print all the commands in the command[]
		 * #5 command for every trick
		 * 			-print that the pet did the trick
		 * #6 setAlive()
		 * 			-if an core statistic falls at or below 0 
		 * 				-set alive to false
		 * 			-else if any core statistic is close to 0
		 * 				-print a warning for that statistic
		 * 			-else 
		 * 				-print that the pet is doing great
		 * #7 setName()
		 * #8 setMasterName()
		 * #9 reset()
		 * 		-if the pet has died
		 * 			-Ask if they want a new pet
		 * 			-if they say yes 
		 * 				-reset alive, petName, and all core statistics
		 * #10 printStats()
		 * 			-print the core statistics
		 * #11 loseStats()
		 * 			-subtract from each statistic 
		 */

	public void printChoices() {
		for(int i = 0; i < this.choices.length; i++) {  //array.length returns the number of items in an array
			System.out.println("#" + (i+1) + ": " +  this.choices[i]); //array[index] gets the item at a given index of an array
		}
	}
	
	public Stopwatch startHappyTime() {
		this.happyTime.start();
		return this.happyTime;
	}
	
	public Stopwatch startLifeTime() {
		this.lifeTime.start();
		overflow();
		return this.lifeTime;
	}
	
	public Stopwatch startRestroomTime() {
		this.restroomTime.start();
		return this.restroomTime;
	}
	
	public String getPetName() {
		System.out.println("What do you want to name your pet Niffler?");
		petName = scan.nextLine();
		return this.petName;
	}
	
	public String getMasterName() {
		System.out.println("What is your name?");
		this.masterName = scan.nextLine();
		getPronoun();
		return this.masterName;
	}
	
	public void getPronoun() {
		System.out.println("Are you a girl or a boy?");
		pronoun = scan.nextLine().toLowerCase();
		setPronoun();
	}
	
	private String setPronoun() {
		if(pronoun.equals("girl") || pronoun.equals("Girl")) {
			this.pronoun = ("her");
		}
		else if(pronoun.equals("boy") || pronoun.equals("Boy")){
			this.pronoun = ("him");
		}
		return this.pronoun;
	}
	
	private void printStats() {
		System.out.println("Eat:" + this.eat);
		System.out.println("Sleep:" + this.sleep);
		System.out.println("Restroom:" + this.restroom);
		System.out.println("Happiness:" +this.happiness);
		System.out.println("Gold:" + this.gold);
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	private String choose() {
		String myChoice = "";
		printChoices();
		System.out.println("What should " + this.petName + " do?");
		myChoice = scan.nextLine().toLowerCase();
		return myChoice;
	}
	
	public void doChoice(String myChoice) {
		if(myChoice.equals("give gold")|| myChoice.equals("1")) {
			if(this.giveGoldDice.roll()) {
				System.out.println(this.masterName + " tells " + this.petName + " to get gold for " + this.pronoun + ".");
				this.gold = gold + 5;
				printStats();
				overflow();
				choose();
			}
			else {
				System.out.println(this.petName + " did not give gold, and has " + this.giveGoldDice.getProb() + " chances to getting it next time.");
				this.gold = gold + 0;
				printStats();
				overflow();
				choose();
			}
		}
		else if(myChoice.equals("run")|| myChoice.equals("2")) {
			if(this.runDice.roll()) {
				System.out.println(this.masterName + " tells " + this.petName + " to run for " + this.pronoun + ".");
				this.happiness = happiness + 100;
				printStats();
				overflow();
				choose();
			}
			else {
				System.out.println(this.petName + " did not run, and has " + this.runDice.getProb() + " chances to getting it next time.");
				this.happiness = happiness + 50;
				printStats();
				overflow();
				choose();
			}
		}
		
		else if(myChoice.equals("steal") || myChoice.equals("3")) {
			if(this.stealDice.roll()) {
				System.out.println(this.masterName + " tells " + this.petName + " to steal gold for " + this.pronoun + ".");
				this.gold = gold + 7;
				printStats();
				overflow();
				choose();
			}
			else {
				System.out.println(this.petName + " did not steal, and has " + this.stealDice.getProb() + " chances to getting it next time.");
				this.gold = gold + 0;
				printStats();
				overflow();
				choose();
			}
		}
		else if(myChoice.equals("help")|| myChoice.equals("4")) {
			if(this.helpDice.roll()) {
				System.out.println(this.masterName + " tells " + this.petName + " to help others on behalf of " + this.pronoun + ".");
				this.happiness = happiness + 100;
				printStats();
				overflow();
				choose();
			}
			else {
				System.out.println(this.petName + " did not help, and has " + this.helpDice.getProb() + " chances to getting it next time.");
				this.happiness = happiness + 50;
				printStats();
				overflow();
				choose();
			}
		}
		else if(myChoice.equals("eat") || myChoice.equals("5")) {
			System.out.println(this.masterName + " tells " + this.petName + " to eat.");
			this.eat = eat + 100;
			printStats();
			overflow();
			choose();
		}
		else if(myChoice.equals("restroom")|| myChoice.equals("6")) {
			System.out.println(this.masterName + " tells " + this.petName + " to go the restroom.");
			this.restroom = restroom + 100;
			printStats();
			overflow();
			choose();
		}
		else if(myChoice.equals("sleep")|| myChoice.equals("7")) {
			System.out.println(this.masterName + " tells " + this.petName + " to sleep.");
			this.sleep = sleep + 100;
			printStats();
			overflow();
			choose();
		}
		
		else if(myChoice.equals("test death")|| myChoice.equals("8")) {
			System.out.println(this.masterName + " tells " + this.petName + " to test death.");
			this.alive = false;
			this.restroom = 0;
			this.eat = 0;
			this.sleep = 0;
			this.happiness = 0;
			this.gold = 0;
			reset();
		}
		
		else if(myChoice.equals("play")|| myChoice.equals("9")) {
			if(this.playDice.roll()) {
				System.out.println(this.masterName + " tells " + this.petName + " to play with " + this.pronoun + ".");
				this.happiness = happiness + 100;
				printStats();
				overflow();
				choose();
			}
			else {
				System.out.println(this.petName + " did not play, and has " + this.playDice.getProb() + " chances to getting it next time.");
				this.happiness = happiness + 50;
				printStats();
				overflow();
				choose();
			}
		}
		else if(myChoice.equals("go into the suitcase")|| myChoice.equals("10")) {
			if(this.goIntoTheSuitcaseDice.roll()) {
				System.out.println(this.masterName + " tells " + this.petName + " to go into the suitcase.");
				this.happiness = happiness + 100;
				printStats();
				overflow();
				choose();
			}
			else {
				System.out.println(this.petName + " did not go into the suitcase, and has " + this.goIntoTheSuitcaseDice.getProb() + " chances to getting it next time.");
				this.happiness = happiness + 50;
				printStats();
				overflow();
				choose();
			}
		}
		else if(myChoice.equals("buy")|| myChoice.equals("11") || myChoice.equals("buy somethiing")) {
			if(this.buyDice.roll()) {
				System.out.println(this.masterName + " tells " + this.petName + " to go buy something for  " + this.pronoun + ".");
				this.happiness = happiness + 100;
				printStats();
				overflow();
				choose();
			}
			else {
				System.out.println(this.petName + " did not go buy something, and has " + this.buyDice.getProb() + " chances to getting it next time.");
				this.happiness = happiness + 50;
				printStats();
				overflow();
				choose();
			}
		}
		else if(myChoice.equals("")|| myChoice.equals("12")){
			System.out.println(this.masterName + " tells " + this.petName + " to do nothing.");
			this.happiness = happiness - 5;
			overflow();
			printStats();
			choose();
		}
		else {
			System.out.println(this.masterName + " tells " + this.petName + " to do nothing.");
			this.happiness = happiness - 5;
			overflow();
			printStats();
			choose();
		}
		
	}
	
	public void choice(String myChoice) {
		myChoice = choose();
		doChoice(myChoice);
	}

	public void setPetName() {
		this.petName = getPetName();
	}

	public void setMasterName() {
		this.masterName = getMasterName();
	}
	
	public void setAlive() {
		if(this.alive == false || happiness == 0 || eat == 0 || restroom == 0 || happiness ==0) {
			this.happyTime.stop();
			this.restroomTime.stop();
			this.lifeTime.stop();
			System.out.println(this.petName + " was alive for " + lifeTime.getElapedTime() + " seconds.");
			System.out.println(this.petName + " was happy for " + happyTime.getElapedTime() + " seconds.");
			reset();
		}
		else if(happiness <= 15) {
			System.out.println("Your Niffler, " + this.petName + " is at " + this.happiness + " level, and might die soon.");
			this.happyTime.pause();
		}
		else if(eat <= 15) {
			System.out.println("Your Niffler, " + this.petName + " is at " + this.eat + " level, and might die soon.");
			this.happyTime.pause();
		}
		else if(restroom <= 15) {
			System.out.println("Your Niffler, " + this.petName + " is at " + this.restroom + " level, and might die soon.");
			this.restroomTime.pause();
		}
		else if(sleep <= 15) {
			System.out.println("Your Niffler, " + this.petName + " is at " + this.sleep + " level, and might die soon.");
			this.happyTime.pause();
		}
		else {
				happyTime.unpause();
				restroomTime.unpause();
		}
		}
	
	public void live() {
		while(this.alive) {
			if(this.alive && this.happiness > 0) {
				String choice = choose();
				doChoice(choice);
				loseStats();
				setAlive();
			}
			else {
				setAlive();
			}
		}
	}
	
	public void reset() {
		if(this.isAlive() == false && this.happiness <= 0) {
			System.out.println("Your pet has died. Would you like another one?");
			String yesNo = scan.nextLine().toLowerCase();
			if(yesNo.contains("yes")) {
				this.alive = true;
				startHappyTime();
				startLifeTime();
				startRestroomTime();
				getPetName();
				getMasterName();
				resetStats();
				getPronoun();
				printStats();
				choose();
			}
			else {
				System.out.println("Thank you for playing!");
				this.alive = false;
				System.exit(0);
			}
		}
		
	}

	public void setSleep(int sleep) {
		if(this.sleep < 0) {
			this.sleep = 0;
		}
	}

	public void setEat(int eat) {
		if(this.eat < 0) {
			this.eat = 0;
		}
	}

	public void setRestroom(int restroom) {
		if(this.restroom < 0) {
			this.restroom = 0;
		}
	}

	public void setHappiness(int happiness) {
		if(this.happiness < 0) {
			this.happiness = 0;
		}
	}

	public void setGold(int gold) {
		if(this.gold < 0) {
			this.gold = 0;
		}
	}

	public void resetStats() {
		this.gold = rand.nextInt(21) + 20;
		this.happiness = 100;
		this.restroom = 100;
		this.sleep =100;
		this.eat = 100;
	}
	
	public void overflow() {
			if(this.gold > 100) {
				this.gold = 100;
			}
			else if(this.happiness > 100) {
				this.happiness = 100;
			}
			else if(this.eat > 100) {
				this.eat = 100;
			}
			else if(this.restroom > 100) {
				this.restroom = 100;
			}
			else if(this.sleep > 100) {
				this.sleep = 100;
			}
	}
	
	public void loseStats() {
		if(this.isAlive() == true) {
			this.eat -= rand.nextInt(10) + 1;
			this.sleep -= rand.nextInt(10) + 1;
			this.restroom -= rand.nextInt(10) + 1;
			this.happiness -= rand.nextInt(10) + 1;
		}	
	}
}