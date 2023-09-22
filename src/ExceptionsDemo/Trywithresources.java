package ExceptionsDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import java.io.Writer;
import java.util.Scanner;

public class Trywithresources {
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		try(PrintWriter writer = new PrintWriter(new File("/home/bondilisinghtha/Downloads/test.txt")))
		{
			
		     writer.println("Hello All");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("No file found");
		}

	}

}
