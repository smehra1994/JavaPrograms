
public class ReverseString {

	public static void main(String[] args) {  
        
		String str="Sankalpa";
		
		int len=str.length();
		String rev="";
		//we take len-1 as index is 0-7 but length is 8
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);    //char will start storing in rev from back
		}
		
		System.out.println(rev);
		
		
		
		 /* 2nd Method 
		 * StringBuilder sb = new StringBuilder("Sankalpa");
		 * System.out.println(sb.reverse());
		 */
         
    }  
}
