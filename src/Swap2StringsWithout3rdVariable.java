
public class Swap2StringsWithout3rdVariable {

	public static void main(String[] args) {
	
		String a="Sankalpa";
		String b="Ridhi";
		
		System.out.println("Before Swap :");
		System.out.println(a);
		System.out.println(b);
		
		a=a+b;   //SankalpaRidhi
		
		b=a.substring(0, 8); //Sankalpa
		//b=a.substring(0, a.length()-b.length());  //SankalpaRidhi-Ridhi=Sankalpa
		
		//a=a.substring(b.length());
		a=a.substring(8);

		
		System.out.println("After Swap :");
		System.out.println(a);
		System.out.println(b);
		
	}

}
