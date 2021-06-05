//Print 1-100 without writing any number in code
public class PrintNumbersWithoutWritingNumber {

	public static void main(String[] args) {
	
		int one='A'/'A';   //A/A=1
		/*
		 * String s1="..........";
		 * 
		 * //method 1 for(int i=one;i<=(s1.length() * s1.length());i++) {
		 * System.out.println(i); }
		 */
		
		//method 2
		for(int i=one;i<='d';i++)   //d is askii value of 100 - 97a 98b 99c 100d
		{
			System.out.println(i);
		}
	}

}
