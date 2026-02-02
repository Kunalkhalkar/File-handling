/*
*write the program to read the the data that written in previous code */
import java.util.*;
import java.io.*;

public class Read{
	public static void main(String ...x) throws Exception{
		Scanner sc = new Scanner(System.in);
		/*
		*reader class*/
		Reader fr = new FileReader("E:\\downloads\\file handling giris\\Bycode\\abc.txt");
		
		int data;
		while((data = fr.read())!= -1){
			System.out.print((char) data);
			Thread.sleep(100);
		}
		fr.close();
		System.out.println();
		// creating another stream
		
		Reader br = new FileReader("E:\\downloads\\file handling giris\\Bycode\\abc.txt");
		
		/*Note: BufferedReader contain readLine() method which is used for read data from file line by line and when file is end return null
		
		BufferedReader(Reader): this constructor is used for accept reader class reference 
		*/
		
		BufferedReader r = new BufferedReader(br);
		String line;
		while((line = r.readLine()) != null){
			System.out.println(line);
			Thread.sleep(1000);
		}
	}
}