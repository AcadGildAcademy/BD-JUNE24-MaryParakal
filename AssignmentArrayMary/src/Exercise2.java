/*
 * Problem Title: Sort an array and insert an element inside it?

Description: Following Write a program to sort an array elements and defined method insertElement() to accomplish the task.

Hint: Use One dimensional Array. 

Output:

Sorted array: [length: 10]
-9, -7, -3, -2, 0, 2, 4, 5, 6, 8
Didn't find 1 @ -6
With 1 added: [length: 11]
-9, -7, -3, -2, 0, 1, 2, 4, 5, 6, 8
 */
public class Exercise2 {

	public static void main(String[] args) {
		Exercise2 obj = new Exercise2();
		int intArray[] = {8,6,5,0,-9, -7, -3, -2,  2, 4};
		obj.printArray(intArray);
		
		obj.sortArray(intArray);
		System.out.println(" After sorting");
		obj.printArray(intArray);
		System.out.println(" After inserting 11");
		int newArray[] = obj.insertElement(11,intArray);
		obj.printArray(newArray);

		// TODO Auto-generated method stub

	}
	public int[] insertElement (int newElement ,int intArray[]) {
		int newArray[] = new int [intArray.length+1];
		int j =0;
		boolean foundIndexForInsertion = false ;
		for(int i =0; i < intArray.length; i++ ) {
			if(intArray[i] <= newElement) {
				newArray[j] = intArray[i];
				j++;
				if (i == intArray.length-1) {
					if (!foundIndexForInsertion) {
						newArray[j]= newElement;
					}
					
				}
				
			} else {
				if (!foundIndexForInsertion) {
					newArray[j]= newElement;
					j++;
					newArray[j] = intArray[i];
					j++;
					foundIndexForInsertion = true;
				} else {
					newArray[j] = intArray[i];
					j++;
				}
						
			}
			
		}
	
		return newArray;
		
	}
	public void printArray(int intArray[]) {
		System.out.print("{");
		for (int i=0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			if(i != intArray.length-1) {
				System.out.print(",");
			}else {
				System.out.print("}\n");
			}
		}
	}
	public void sortArray(int intArray[]) {
		for (int i= 0; i < intArray.length; i++) {
			for (int j=0; j< intArray.length; j++) {
				if (intArray[i] < intArray[j]) {
					int temp = intArray [j];
					intArray [j] = intArray [i];
					intArray [i]= temp;
				}
			}
		}
	}
	

}
