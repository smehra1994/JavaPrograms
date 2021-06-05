
public class Swap2IntegersWithout3rdVariable {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
	//Method 1 :with 3rd temp variable

		/*
		 * int t; // temporary variable 
		 * t = x; 
		 * x = y; 
		 * y = t; 
		
		 */

	
	//Method 2 : Without 3rd variable
		
		x=x+y;   //10+5=15
		y=x-y;   //15-10=5
		x=x-y;   //15-5=10
		
	//Method 3 : Without 3rd variable
		
	/*
	 * x=x*y; //10*5=50 
	 * y=x/y; //50/10=5 
	 * x=x/y; //50/5=10
	 */
		
		
		
		System.out.println(x);
		System.out.println(y);
	
	
	}
}
