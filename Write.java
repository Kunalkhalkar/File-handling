/*
*writing some data in the file
*/
import java.util.*;
import java.io.*;

public class Write{
	public static void main(String ...x) throws Exception{// use throws
		
		Writer fw = new FileWriter("E:\\downloads\\file handling giris\\Bycode\\abc.txt", true); // true means append mode on other wise it vanish all previous data and write again
		
		/*
		System.out.println("Enter the data in file");
		fw.write(new Scanner(System.in).nextLine());// this filr writer can only write on singlr line by using \n we can select new line but more realiable is to use 'BufferedWriter(Writer)'
		System.out.println("Data write successfully");
		*/
		
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Enter the data in file by using the buffered writer");
		bw.write(new Scanner(System.in).nextLine());
		bw.newLine();
		bw.close();
		fw.close();
		
		System.out.println("Data write successfully");
	}
}