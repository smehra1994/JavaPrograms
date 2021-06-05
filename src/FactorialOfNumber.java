/*Factorial example:
	3=3*2*1=6
	5=5*4*3*2*1=120
	10=10*9*8*7*6...1
	1=1
	0=1*/
public class FactorialOfNumber {

	//Non Reccurssion Method
	public static int factorial(int n)
	{
		int fact=1;                  //not with 0 as it wont return anything
	
		if(n==0)                     //exception case
			return 1;
		for(int i=1;i<=n;i++)         
			{
			fact=fact*i;              //  1*1 1*2 1*3 1*4 1*5 - 1*2*3*4
		}
		return fact;
	}
	
	public static void main(String[] args) {
	
		System.out.println(factorial(12));
	}
	
	
	
	
	
	
	
	//Recurrsion : using a reccursive function which mean a function calling itself
	/*
	 * public static int factorial(int n) 
	 * { 
	 * if(n==0) 
	 * 	return 1; 
	 * else 
	 * 	return(num *fact(num-1));
	 * }
	 */
	

}
