import java.util.Scanner;

/*
 * Problem Title: Write a Java program to check whether number is even or odd?

Description: Write a Java program to determine whether an input number is an even number/odd number.

Hint: use simple if...else statement

 */
public class Exercise2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: "); 
		int num = scanner.nextInt();
		if(num % 2 == 0) {
			System.out.println("Number is even.");
		} else {
			System.out.println("Number is odd.");
		}

	}

}
