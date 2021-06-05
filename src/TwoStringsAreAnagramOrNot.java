import java.util.Arrays;

public class TwoStringsAreAnagramOrNot {

	public static void main(String[] args) {

		String s1 = "silent";
		String s2 = "listen";
		boolean isAnagram;

		if (s1.length() == s2.length()) {
			char s1AsCharArray[] = s1.toCharArray();
			char s2AsCharArray[] = s2.toCharArray();

			Arrays.sort(s1AsCharArray);
			Arrays.sort(s2AsCharArray);

			isAnagram = Arrays.equals(s1AsCharArray, s2AsCharArray);
			System.out.println(isAnagram);
		}
	}
}