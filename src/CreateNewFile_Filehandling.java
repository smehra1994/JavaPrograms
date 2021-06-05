import java.io.File;
import java.io.IOException;

public class CreateNewFile_Filehandling {

	public static void main(String[] args) throws IOException {
	
		String filePath="C:/Users/sanka/Documents/selenium notes/Linux/sank1.txt";
		
		File file=new File(filePath);
		
		boolean flag=file.createNewFile();
		if(flag)
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("File already present");
		}
	}

}
