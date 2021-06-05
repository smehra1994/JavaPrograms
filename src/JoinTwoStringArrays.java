import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinTwoStringArrays {

	public static void main(String[] args) {
		
		String arr1[] = { "Sank", "Raj", "nidhi"};
		String arr2[] = {"Sank", "karan", "nj" };

		
		List l=new ArrayList(Arrays.asList(arr1));
		l.addAll(Arrays.asList(arr2));
	    Object[] c = l.toArray();
	    System.out.println(Arrays.toString(c));
	}

}
