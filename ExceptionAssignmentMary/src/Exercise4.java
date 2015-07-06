/*
 * Problem Title: Handle NullPointer Exception.

Description: It will occur whenever a member is invoked with a null object.

Hint: In catch block handle NullPointerException.

 */

public class Exercise4 {
	public static void main(String []args) {
		try {
			Exercise4 obj =null; ;
			obj.test();
		}catch (NullPointerException e) {
			System.out.println("Caught Exception :" +e.toString());
		}
			
		
	 
		
	}
	public void test(){
		System.out.println("inside test");
	}

}
