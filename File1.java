/*
*creating the file
*/

import java.io.*;
import java.util.*;

public class File1{
	public static void main(String ...x)throws Exception{
		File f = new File("E:\\downloads\\file handling giris\\Bycode\\abc.txt");
		if(f.exists()){
			System.out.println("File exists");
		}
		else{
			boolean b = f.createNewFile();
			if(b){
			System.out.println("File created");
			return;
			}
			System.out.println("File is not created");
			
		}
	}
}