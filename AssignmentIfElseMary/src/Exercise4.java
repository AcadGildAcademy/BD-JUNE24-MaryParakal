import java.util.Scanner;

/*
 * Problem Title: Write a Java program to determines if a given alphabet is vowel or consonant?

Description: One and only one println statement should execute, no matter what is the value of ch (a-z or A-Z).

Hint: Use Java If-Else Ladder statement with Logical OR (||) Operator.

Output: o is vowel.
 */
public class Exercise4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an alphabet: "); 
		String alphabet = scanner.next();
		String str = alphabet.toUpperCase();
		
		if ("A".equals(str) || "E".equals(str) || "I".equals(str) || "O".equals(str) || "U".equals(str)) {
			System.out.println(alphabet  +" is a vowel"); 
		} else {
			
			System.out.println(alphabet  +" is a consonant"); 
			
		}
		// TODO Auto-generated method stub

	}

}
