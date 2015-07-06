import java.util.Scanner;

/*
 * 
Problem Title: Write a Java program to check whether year is leap year or not?

Description: You need to first check if the year is divisible by 100 or not.

If the year is divisible by 100, then check if it is divisible by 400. If yes, you need to display a message saying that it is a leap year. Otherwise, you need to print a message saying that it is not a leap year.

If the year is not divisible by 100, then check if it is divisible by 4. If yes, you need to print a message saying that it is a leap year. Otherwise, it is not a leap year.


Hint:  A leap year is a year which is divisible by 4, with the exception that if the year is divisible by 100, then it should also be divisible by 400.Use Nested if...else statement

Output: 2013 is not a leap year
 */
public class Exercise3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: "); 
		int year = scanner.nextInt();
		if(year % 100 == 0) {
			if (year % 400 == 0 ) {
				System.out.println(year +" is a leap year ");
			} else {
				System.out.println(year +" is not a leap year");
			}
			
		} else if (year % 4 == 0){
			System.out.println(year +" is a leap year");
		} else {
			System.out.println(year +" is not a leap year");
		}

	}

}
