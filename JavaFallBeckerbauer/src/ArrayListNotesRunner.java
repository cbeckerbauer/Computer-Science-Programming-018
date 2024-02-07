import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNotesRunner {

	public static void main(String[] args) {
		//Arrays
			// String[] names = new String[10];
			// String[] names = {"Bob", "Sarah"};
			//Downside: The size is the size. We do not get to change it.
		//ArrayLists
			//They change size
			//They must be imported.
			//ArrayList<DataType> variable = new ArrayList<DataType>();
			//ArrayLists must contain objects. They do not work with primitive data types
		
			ArrayList<String> names = new ArrayList<String>();
			
			Scanner scan = new Scanner(System.in);
			
			while(true) {
				System.out.println("What name would you like to add?");
				String name = scan.nextLine();
				if(name.equalsIgnoreCase("none")) {
					break;
				}
				names.add(name);		// arrayList.add(item) adds a new item to the arrayList at the end.
				System.out.println(names);
			}
			
			while(true) {
				System.out.println("What name would you like to remove?");
				String name = scan.nextLine();
				if(name.equalsIgnoreCase("none")) {
					break;
				}
				System.out.println(names.remove(name));		// arrayList.add(item or index) removes an item to the arrayList at the end.
				System.out.println(names);
			}
			
			
			//Looping / iterating through an arraylist
			
			for(int i =0; i < names.size(); i++) { 		//ArrayList.size() returns the number of items in an ArrayList
				System.out.println("#" + (i+1) + ": "+ names.get(i));  		//ArrayList.get(index or item) returns the item at that index or just that item
			}
			
			//ArrayList 	is 		ArrayList.size();
			//String 		is 		String.length();
			//Array 		is 		Array.length;
			
			/* 
			 * If you want an ArrayList of Primitives use Object Primitives
			 * 
			 * byte			Byte		
			 * short		Short
			 * int			Integer
			 * long			Long
			 * float		Float
			 * double		Double
			 * boolean		Boolean
			 * char			Character
			 */
			
			
			int num = 0;
			Integer number = 0;
			//Object Primitives have a bunch on built in methods you can use
			//They are complete objects and use much more objects then a primitive is the downside
	}

}
