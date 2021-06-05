
public class VerifyStringContainsOnlyDigits {
	
	public static void main(String []args) {
	      String str = "4434a";
	      if(str.matches("[0-9]+") && str.length() > 2) {
	         System.out.println("String contains only digits!");
	      }
	      else
	      {
	    	  System.out.println("No");
	      }
	   }
}
