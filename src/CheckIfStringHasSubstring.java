
public class CheckIfStringHasSubstring {

	public static boolean isSubstring(String str1, String str2) {
		return str1.matches("(.*)" +str2+ "(.*)");

	}

	public static void main(String[] args) {

		System.out.println(isSubstring("Sankalpa", "aan"));
		System.out.println(isSubstring("Sankalpa", "an"));
	}

}
