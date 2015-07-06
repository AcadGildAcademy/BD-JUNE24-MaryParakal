import java.util.Scanner;


/*
 * Problem Title: Write a Java program to check whether you are eligible for vote or not?

Description: Write a Java program to allow the user to input his/her age. Then the program has to show whether the person is eligible to vote or not. 

Condition: A person who is eligible to vote must be older than or equal to 18 years.

Hint: use simple if...else statement

Output: 
Enter your age: 18
You are eligible to vote.
 */
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: "); 
		int age = scanner.nextInt();
		if(age >= 18 ) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}

	}

}
