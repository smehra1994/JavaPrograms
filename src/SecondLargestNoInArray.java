import java.util.Arrays;

public class SecondLargestNoInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 3, -5, 7, 2, 4, 333, 0, 9 };

		// Store value in first index in largest and smallest and then keep comparing it
		// with remaining values

		int largest = arr[0];
		int secLargest = arr[0];

		for (int i = 1; i < arr.length; i++) // start loop from 1st index as 0th is already occupied by largest and
												// smallest
		{
			if (arr[i] > largest) 
			{
				secLargest=largest;
				largest = arr[i];
				
			} 
			else if(arr[i] > secLargest) 
			{
				secLargest = arr[i];
			}
		}

		System.out.println("Array numbers are :" + Arrays.toString(arr));
		System.out.println("Largest no is :" + largest);
		System.out.println("Second largest no is :" + secLargest);

	}

}
