import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNotesRunner {

	public static void main(String[] args) {
		//Arrays
			// String[] names = new String[10];
			// String[] names = {"bob", "sarah"}; 
			//Downside: The size is the size. We do not get to change it. 
		
		//ArrayLists
			// They change size!
			// They must be imported 
			// ArrayList<DataType> variable = new ArrayList<DataType>(); 
			ArrayList<String> names = new ArrayList<String>(); 
			
			Scanner scan = new Scanner(System.in);
			
			while(true) {
				System.out.println("What name would you like to add?");
				String name = scan.nextLine();
				if(name.equalsIgnoreCase("none")) {
					break;
				}
				names.add(name);   // arrayList.add(item)  adds a new item to the arraylist at the end. 
				System.out.println(names);
			}
			
			while(true) {
				System.out.println("What name would you like to remove?");
				String name = scan.nextLine();
				if(name.equalsIgnoreCase("none")) {
					break;
				}
				System.out.println(names.remove(name));   // arrayList.add(item or index)  removes an item from the arraylist. 
				System.out.println(names);
			}
			
			

	}

}
