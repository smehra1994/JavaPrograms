
public class ReverseInteger {

	public static void main(String[] args) {

		// 1st method
		int num = 12345;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			// 0*10 + 12345%10 = 0+5=5 Similarly loop will get 4 3 2 1
			num = num / 10;
			// num wil now be 1234 after first run then 123 12 1 0 and when num=0 loop wont
			// run further
		}
		System.out.println(rev);
	}

	/*
	 * 2nd Method long num1=12345; StringBuilder b=new
	 * StringBuilder(String.valueOf(num1)).reverse(); System.out.println(b);
	 */
}
