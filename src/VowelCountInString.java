
public class VowelCountInString {
	
	public static boolean isVowel(char c)
	{
		return c == 'a'|| c == 'e'|| c == 'i' || c == 'o' || c == 'u' ||
				c == 'A'|| c == 'E'|| c == 'I' || c == 'O' || c == 'U';
	}

	public static void main(String[] args) {
		
		String str="SankalpeU";
		int vcount=0;
		for(int i=0;i<str.length();i++)
		{
			if(isVowel(str.charAt(i)))
			{
				vcount++;
			}
		}
		
		System.out.println(vcount);
	}

}
