
public class PrintDuplicateNumbersInArrayWithCount {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,5,5,5};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			count = 1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='0';
				}
			}
			if(count>1 && arr[i]!='0')
	        {
	        	System.out.println(arr[i] + "  " + count);
	        }
		}
	}

}
