/*
*file handling basics
*creating the folder
*/
import java.util.*;
import java.io.*;
public class file{
	public static void main(String ...x){
		//System.out.println("Enter the data");
		File f  = new File("E:\\downloads\\file handling giris\\ByCode");
		if(f.exists()){
			System.out.println("Folder is Already exists");
		}
		else{
			boolean b = f.mkdir();
			if(b){
				System.out.println("folder created");
				return;
			}
			System.out.println("error occured");
		}
	}
}