
public class FindMissingNumbersInArray {

	public static void main(String[] args) {
		
		/*
		 * Logic: 
		 * a[]= {1,2,4,5} 
		 * 1+2+4+5=12 
		 * 1+2+3+4+5=15 
		 * 15-12=3
		 */
		

		int a[]= {1,2,3,4,5,7};
		
		int sum=0;
		for(int i=0;i<a.length;i++)         //start from 0th index to last index
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=1;j<=7;j++)              //start from 1st number to last
		{
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		System.out.println("Missing number:" + (sum1-sum));
		
	}

}
