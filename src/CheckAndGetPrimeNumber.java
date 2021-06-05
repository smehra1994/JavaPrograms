//Prime Numbers : Divisible by itself or 0 only and 2 is lowest prime number

public class CheckAndGetPrimeNumber {

	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;          //2 is lowest prime no and before that all are non prime
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i == 0)         //eg 10%2=0 non prime but 17%2=1 so prime 
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static void getPrimeNumbers(int num)
	{
		for(int i=2;i<=num;i++)
		{
		if(isPrime(i))
			System.out.println(i);
		{
			
		}
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println(isPrime(17));
		getPrimeNumbers(100);
	}

}
