/*Scenario :Compare 2 integer numbers
Integer Caching : two numbers getting compared via "==" return true as they get autoboxed(== is symbol of refrence which returns always false)
Autoboxing has a range : -128 to 127 -- if u give nay number outside this range this thing wont work*/
		
	public class IntegerCaching {

	public static void main(String[] args) {
		
		Integer a=100;    //used integer wrapper class
		Integer b=100;
		
		if(a == b)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
	}

}
