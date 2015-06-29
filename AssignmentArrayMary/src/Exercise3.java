/*Problem Title: Write an array of strings and display it in the console.

Description: Take a Array of type String having a size of 3. In first position you have to store value "This is the greeting", in second position store "for all the readers from" and in third position store value "Acadgild". Display the data in the console.

Hint: Use One dimensional Array.

Output:

This is the greeting
For all the readers From
Acadgild .*/
public class Exercise3 {
	
	public static void main (String [] args){
		String strArray [] = {"This is the greeting","For all the readers From","Acadgild ."};
		for (int i=0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
	}

}
