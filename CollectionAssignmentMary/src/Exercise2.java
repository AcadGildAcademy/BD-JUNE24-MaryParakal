import java.util.HashSet;
import java.util.Iterator;

/*
 * Problem Title: Write an example, which shows the usage of java.util.HashSet.iterator().
Description: Store the data in HashSet and iterate it using HashSet.iterator().

Hint: The iterator() method is used to iterate over the elements in this set. The elements returned will be in un - ordered manner. 

 */
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Zeena");
		hashSet.add("Alex");
		hashSet.add("George");
		hashSet.add("Neha");
		hashSet.add("Cathy");
		
		for (Iterator iterator = hashSet.iterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
		

	}

}
