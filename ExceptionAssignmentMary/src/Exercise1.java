/*
Challenge I

Problem Title: Handle ArrayIndexOutOfBounds Exception.

Description: For e.g. If array is having only 5 elements and we are trying to display 7th element then it should throw exception.

Hint: In catch block handle ArrayIndexOutOfBoundsException.*/




public class Exercise1 {
	
	public static void main(String []args) {
		try {
			String str [] = { "Mary", "Tara", "Megha","Alex","Tomy"};
			System.out.println("7th Element "+str[6]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught the Exception"+  e.toString());
		}
	}

}
