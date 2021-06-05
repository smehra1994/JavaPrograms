import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile_FileHandling {

	public static void main(String[] args) throws IOException {

		String filePath="C:/Users/sanka/Documents/selenium notes/Linux/sank.txt";
		BufferedReader bf=null;
		
		try {
			File file=new File(filePath);
			bf=new BufferedReader(new FileReader(file));
			
			System.out.println("File Content is : ");
			
			int c=0;
			while((c=bf.read()) !=-1)
			{
				System.out.print((char)c);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			bf.close();
		}
		
	
		
	}

}
