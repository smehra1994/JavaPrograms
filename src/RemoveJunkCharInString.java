
public class RemoveJunkCharInString {

	public static void main(String[] args) {

		String str = "@@SAnk@lp@##";

		// this can be done by reg expression only like [^a-zA-Z0-9] in brackets mention
		// all the values u done want to exclude and ^ stands for not
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
	}

}
