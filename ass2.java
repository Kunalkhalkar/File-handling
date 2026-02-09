/*
Q2. Write a Java program to read and display all content from the file info.txt.
Explanation
This program teaches how to open an existing file and read data from it line by line.
What to Do :- 
Open the file
Read the content
Print it on the console
Expected Learning :-
FileReader
BufferedReader

*/
import java.io.*;
import java.util.*;

public class ass2{
	public static void main(String ...x){
		System.out.println("Enter the data");
		
		File f = new File("E:\downloads\file handling giris\\ByCode\\info.txt");
		Reader r = new FileReader(f);
		Writer w = new FileWriter(r);
		
		
	}
}