import java.util.Scanner;

public class MadLibBeckerbauer {

	public static void main(String[] args) {
		Scanner textScanner = new Scanner(System.in);
		System.out.println("Welcome to Your Own Tonigh Show Starring Jimmy Fallon Mad Lib Chris Pratt Edition!");
		System.out.println("Please only use capital letters when a proper noun and the first word, and no spaces. Hit enter to get the next question to answer, and then enjoy the story the computer has created with your words.");
		System.out.println("Name a type of dessert.");
		String dessert = textScanner.nextLine ();
		System.out.println("Name a silly word.");
		String sillyword = textScanner.nextLine ();
		System.out.println("Name another word for father.");
		String father = textScanner.nextLine ();
		System.out.println("Name a year.");
		String year = textScanner.nextLine ();
		System.out.println("Name a celebrity name.");
		String celebrityname = textScanner.nextLine ();
		System.out.println("Name a type of plant.");
		String plant = textScanner.nextLine ();
		System.out.println("Name an adjective.");
		String adjective = textScanner.nextLine ();
		System.out.println("Name a something you name a pet.");
		String somethingyounameapet = textScanner.nextLine ();
		System.out.println("Name a name of a band.");
		String band = textScanner.nextLine ();
		System.out.println("Name a plural animal.");
		String pluralanimal = textScanner.nextLine ();
		System.out.println("Name a verb ending in -ing.");
		String verbendingining = textScanner.nextLine ();
		System.out.println("Name a number.");
		String number = textScanner.nextLine ();
		System.out.println("Name a measurement of time.");
		String measurementoftime = textScanner.nextLine ();
		System.out.println("Name a body part.");
		String bodypart = textScanner.nextLine ();
		System.out.println("Name a drink.");
		String drink = textScanner.nextLine ();
		System.out.println("Name a type of doctor.");
		String typeofdoctor = textScanner.nextLine ();
		System.out.println("Name a one syllable noise.");
		String onesyllablenoise = textScanner.nextLine ();
		System.out.println("Name a plural noun.");
		String pluralnoun = textScanner.nextLine ();
		System.out.println("Name a mode of transportation.");
		String modeoftransportation = textScanner.nextLine ();
		System.out.println("Name a holiday.");
		String holiday = textScanner.nextLine ();

		System.out.println("Elf: Hi Santa!");
		System.out.println("Santa: Hello " + dessert + ".");
		System.out.println("Elf: You're looking at me like I'm on your naughty list.");
		System.out.println("Santa: I was counting my toys and was one " + sillyword + " short. I believe you stole it." );
		System.out.println("Elf: But " + father + "!");
		System.out.println("Santa: I started making that toy in " + year + ". What will little " + celebrityname + " think when he/she wakes up on Christmas morning with nothing under the " + plant + "?");
		System.out.println("Elf: I would never steal such a " + adjective + " toy.");
		System.out.println("Santa: Where were you the night before Christmas?");
		System.out.println("Elf: I was with " + somethingyounameapet + ". We were listening to " + band + "'s holiday album and making snow " + pluralanimal + ".");
		System.out.println("Santa: Then why did Rudolph see you " + verbendingining + " on the roof " + number + " " + measurementoftime + " before the toy went missing?");
		System.out.println("Elf: That was a coincidence.");
		System.out.println("Santa: The reason I work so hard, is because I get to spread joy to millions of people, and go sit by the fire shaking my " + bodypart + " while eating cookies and drinking " + drink + "." );
		System.out.println("Elf: Fine I stole the toy. But I only did it because I wanted to impress my " + typeofdoctor + ".");
		System.out.println("Santa: " + onesyllablenoise + " " + onesyllablenoise + " " + onesyllablenoise + ". Every time there's a holiday miracle, I sing my favorite Christmas song, Jingle " + pluralnoun + ".");
		System.out.println("(singing)");
		System.out.println("Jingle " + pluralnoun + ", Jingle " + pluralnoun + ",");
		System.out.println("Jingle all the way.");
		System.out.println("Oh what fun it is to ride");
		System.out.println("In a one horse open " + modeoftransportation + ".");
		System.out.println("Elf: Merry " + holiday + " Santa!");
		
	}

}
