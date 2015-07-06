/*
 * Problem Title: Handle StringIndexOutOfBound Exception.

Description: It will occur whenever an index is invoked of a string, which is not in the range.

Hint: In catch block handle StringIndexOutOfBoundsException.
 */
public class Exercise3 {
	public static void main(String []args){
		String str ="Hello World";
		try {
			
			System.out.println(str.charAt(24));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception caught "+ e.toString());	
		}
		
		
	}

}
