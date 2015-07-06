import java.util.ArrayList;
import java.util.Iterator;


/*
 * Problem Title: Write an example for reading all elements from ArrayList by using Iterator.

Description:  Use next method of Iterator class to get ArrayList element values using while loop.

Hint: For each loop is only used for Iteration. That means read only. But using iterator you can modify the collection using the method remove of Iterator class. 
 */
public class Exercise1 {
	public static void main (String []args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mary");
		names.add("John");
		names.add("Mathew");
		
		
		Iterator iterator = names.iterator();
		for (iterator = names.iterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
		iterator = names.iterator();
		while(iterator.hasNext()) {
			if (iterator.next() == "John") {
				iterator.remove();
			}
		}
		System.out.println("After removing John");
		for (iterator = names.iterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
	}

}
