import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter month as number: "); 
		int month = scanner.nextInt();
		String monthString ="";
		int noOfDays = 0;
		switch(month) {
			case 1 :  monthString = "Janurary";  noOfDays = 31; break;
			case 3 : monthString = "March";   noOfDays = 31; break;
			case 5 :  monthString = "May";   noOfDays = 31; break;
			case 7 : monthString = "July";   noOfDays = 31; break;
			case 8 :  monthString = "August";   noOfDays = 31; break;
			case 10 : monthString = "October";  noOfDays = 31; break;
			case 12 :  monthString = "December";   noOfDays = 31; break;
		
			case 4 :  monthString = "April"; noOfDays = 30 ; break;
			case 6 : monthString = "June";noOfDays = 30 ; break;
			case 9 :  monthString = "September";noOfDays = 30 ; break;
			case 11 : monthString = "November"; noOfDays = 30 ; break;
			
			case 2 : monthString = "February"; noOfDays = 28 ; break;
			
		}
		System.out.println(monthString  +" has "+noOfDays +" days"); 
		

	}

}
