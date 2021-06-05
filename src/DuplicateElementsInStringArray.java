import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInStringArray {

	public static void main(String[] args) {
		String arr[] = { "Sank", "Raj", "nidhi", "Sank", "karan", "nj" };

		// Method 1 : We start comparing 1st string one by on with all strings and once
		// we get equal we print the one.Not good due to O(n2) complexity
		
		  for (int i = 0; i < arr.length; i++) 
		  { 
		  for (int j = i + 1; j < arr.length;j++) // j=i+1 as when i is sank then j is Raj i.e. next element for comparison 
		  { 
		  if (arr[i].equals(arr[j])) 
		  {
		  System.out.println("Duplicate Element is : " + arr[i]);
		   } } }
		  
		  }
		 

	// Method 2 : Using HashSet which cant store any duplicate value.Add all
	// elements in it one by one and if some element is existing it will return
	// false

	/*
	 * Set<String> str=new HashSet<String>();
	 * for(String name : arr) 
	 * 		{
	 * 			if(str.add(name) == false) 
	 * 				{ 
	 * 			System.out.println("Duplicate Element is :" +name); 
	 * } }
	 */
}
