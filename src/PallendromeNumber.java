
public class PallendromeNumber {

	public static void isPallendrome( int num)
	{
		int remainder;
		int reversedInteger=0;
		int orignalInteger;
		
		orignalInteger=num;
		
		//here while loop run for 2 times
		while(num>0)
		{
			remainder=num%10;    // 131%10=1                                   2loop-13%10=3
			reversedInteger=reversedInteger*10 + remainder;  //0*10+1=1        2loop-1*10+3=13
			num=num/10;    //131/10=13  now it will reach to start of loop and check num>0i.e 13>0-yes so again run samme conditions       2loop-131/10=13
		}
		
		if(orignalInteger==reversedInteger)
		{
			System.out.println("Number is pallendrome");
		}
		else
			System.out.println("Number is non pallendrome");
	}
	

	
	public static void main(String[] args) {
	
		isPallendrome(137);
	}

}
