/*
Problem Title: Print Reverse of an Array.

Description: Write a program to print Reverse of an Array.

Hint: Use One dimensional Array. 
*/


public class ArrayExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char []ch = { 'a','b','c','d','e','f'};
		char []ch = { 'T','h','o','m','a' ,'s'};
		System.out.print("Original Array ={");
		for (int i=0; i < ch.length; i++) {
			System.out.print(ch[i]);
			if(i != ch.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
		System.out.print("\nReverse Array = {");
		for (int i=ch.length-1; i >= 0; i--) {
				
			System.out.print(ch[i]);
			if(i != 0) {
				System.out.print(",");
			}
		}
		System.out.print("}");
		
		
	}

}
