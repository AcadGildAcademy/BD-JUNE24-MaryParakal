/*Problem Title: How to determine the upper bound of a two dimensional array ?

Description: Write a program to determine the upper bound of a two dimensional array with the use of arrayname.length.

Hint: Use Two dimensional Array.

Output:

Dimension 1: 2
Dimension 2: 5

*/
public class Exercise5 {
	public static void main(String [] args){
		int numbers [][] = new int [2][5];
		System.out.println("Dimension 1: "+numbers.length);
		System.out.println("Dimension 2: "+numbers[0].length);
	}

}
