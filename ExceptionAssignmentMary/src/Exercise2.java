
 /**

Problem Title: Handle NumberFormat Exception.


Description: For E.g. The statement int num=Integer.parseInt ("XYZ") ;
 would throw NumberFormatException because String cannot be parsed to int. So handle it.

Hint: In catch block handle NumberFormatException.

*/


public class Exercise2 {
	public static void main(String []args) {
		try {
			int num=Integer.parseInt ("XYZ");	
		} catch (NumberFormatException e) {
			System.out.println("Caught Exception :" +e.toString());
		}
		
		
	}

}
