//Pass null argument with method overloading with object and string types
public class PassNullArgumentWithMEthodOverloading {

	
	public static void Test(String s) 
	{
		System.out.println("String get called first");
	}
	
	public static void Test(Object o)
	{
		System.out.println("Object get called first");
	}
	public static void main(String[] args) {
		
		Test(null);
	}

}
