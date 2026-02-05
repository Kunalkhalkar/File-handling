/*
Q1. Write a Java program to create a text file named info.txt and write the message "Welcome to Java File Handling" into it.
Explanation
This program helps you understand how to create a file and write data into it using Java file handling classes.
What to Do :- 
Create a file
Write a simple text message
Close the file properly
Expected Learning :- 
File class
FileWriter class
now we'll do some assignment on file handling
*/
import java.io.*;
import java.util.*;

public class ass1{
	public static void main(String ...x)throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data in the file");
		File f= new File("E:\\downloads\\file handling giris\\info.txt");
		FileWriter fw = new FileWriter(f);
		
		fw.write(sc.nextLine());
		fw.close();
		FileReader fr = new FileReader(f);
		int data;
		
		while((data = fr.read()) != -1){
			System.out.print((char)data);
		}
		fw.close();
	}
}