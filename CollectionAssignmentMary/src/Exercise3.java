import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Problem Title: Write an  example which shows the usage of java.util.HashMap.entrySet().

Description:  The method "entrySet()" call returns a set view of the mappings contained in this map.

Hint: Use Set Class to store the result of value returned by "entrySet()".

Output: Set values: [1=tutorials, 2=point, 3=is best]

 */
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1,"tutorials");
		hashMap.put(2,"point");
		hashMap.put(3,"is best");
		
		Set<Map.Entry<Integer,String>> values = hashMap.entrySet();//.iterator();
		System.out.println("Output: Set values: "+values);
		
	}

}
