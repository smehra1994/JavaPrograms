import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Blue");
		colors.add("Green");
		colors.add("Pink");
		colors.add("Yellow");
		colors.add("Black");
		
		
		//Iterator<String> it = colors.iterator();
		
		//Method1
		/*
		 * for(String c : colors) { System.out.println(c);
		 * 
		 * }
		 */
		
		//Method 2
		for(int i=0;i<colors.size();i++)
		{
			System.out.println(colors.get(i));
			if(colors.get(i).equals("Pink")) 
			{
				System.out.println("Achieved");
			}
			else
			{
				System.out.println("No");
			}
		}
		
		
	}

}
