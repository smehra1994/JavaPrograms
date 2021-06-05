
public class SumAndAverageOfArray {

	public static void main(String[] args) {
		double arr[]= {1,2,3,4,5,6};
		double sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];                     //Sum of Array
		}
		double average=sum/arr.length;          //Average of Array
		System.out.println(average);
	}

}
