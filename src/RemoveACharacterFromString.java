
public class RemoveACharacterFromString {

	public static void main(String[] args) {
	String str="Sankalpa";
	
	StringBuilder b=new StringBuilder(str);
	b.deleteCharAt(3);
	System.out.println(b);

	}

}
