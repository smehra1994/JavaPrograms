
public class PrintNumbersWithoutLoop {
	
	
	public static void printNum(int startnum,int endnum){
		
		if(startnum<=100)
		{
			System.out.println(startnum);
			startnum++;
			printNum(startnum,endnum);
		}
	}

	public static void main(String[] args) {
		
		printNum(1,100);
	}

}
