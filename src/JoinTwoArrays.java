import java.util.Arrays;

public class JoinTwoArrays {
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int arr1[]= {5,6,7};
		
		int a=arr.length;
		int b=arr1.length;
		
		int[] result = new int[a+b];  //resultant array of size first array and second array  
		System.arraycopy(arr, 0, result, 0, a);  
		System.arraycopy(arr1, 0, result, a, b); 
 
	System.out.println(Arrays.toString(result));    

}}
