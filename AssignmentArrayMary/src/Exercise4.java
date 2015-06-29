import java.util.Scanner;

/*
 * Problem Title: Matrix Multiplication.

Description: Write a program to display a Matrix Multiplication.

Hint: Use Two dimensional Array.
 */
public class Exercise4 {
	Scanner in = new Scanner(System.in);
	int first[][];
	public static void main(String []args) {
		Exercise4 obj = new Exercise4();
		int row1 ,col1, row2, col2, sum ;
		 
	    
	    System.out.println("Enter the number of rows of first matrix");
	    row1 = obj.in.nextInt();
	    System.out.println("Enter the number of cols of first matrix");
	    col1 = obj.in.nextInt();

	    int first[][] = new int[row1][col1];

	    System.out.println("Enter the elements of first matrix");
	    obj.inputMatrix(first,row1, col1);
	    obj.printMatrix(first);
	    
	    System.out.println("Enter the number of rows of second matrix");
	    row2 = obj.in.nextInt();
	    System.out.println("Enter the number of cols of second matrix");
	    col2 = obj.in.nextInt();

	    int second[][] = new int[row2][col2];

	    System.out.println("Enter the elements of second matrix");
	    obj.inputMatrix(second,row2, col2);
	    obj.printMatrix(second);
	    obj.multiply(first, second);
	
	}
	
	public void inputMatrix (int first[][],int rows, int cols) {
	    for(int i = 0; i < rows; i++ ){
	    	for(int j =0; j<cols; j++) {
	    		
	    		first [i][j] = in.nextInt();
	    	}
	    }
		
	}
	public void printMatrix (int [][]matrix) {
	    for(int i = 0; i < matrix.length; i++ ){
	    	for(int j =0; j<matrix[i].length; j++) {
	    		
	    		System.out.print(matrix [i][j]+"\t");
	    	}
	    	System.out.print("\n");
	    	
	    }
		
	}
	public void multiply(int first[][], int second[][]) {
		if (first[0].length != second.length) {
			System.out.println("matrix cannot be multiplied");
			return;
		}
		int product[][] = new int [first.length][second[0].length];
		for( int i=0; i < product.length; i++) {
			int sum=0;
			for( int j=0; j < product[0].length; j++) {
				for (int k =0; k <first[0].length ;k++) {
					sum = sum + first[i][k]* second[k][j];
					
				}
				product[i][j] = sum;
				sum = 0;
				
			}
			
			
		}
		this.printMatrix(product);
	}
	
	
	
}
