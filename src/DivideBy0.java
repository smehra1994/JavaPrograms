
public class DivideBy0 {

	public static void main(String[] args) {
		
		System.out.println(3/0);     //arithmetic Exception
		
		//for below all floating num we ll get "infinity"
		System.out.println(3.0/0);
		System.out.println(19.990/0.00);
		System.out.println(10/0.0);
		System.out.println(3.6f/0);
		
		System.out.println(0.0/0);    //gives NaN
		System.out.println(0.0/0.0);
		
		
		/*
		 * NaN- not a Number when we are performing floating point numbers negative
		 * scenarios
		 */
	}

}
