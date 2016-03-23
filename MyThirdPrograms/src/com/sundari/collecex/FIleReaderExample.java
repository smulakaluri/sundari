package com.sundari.collecex;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class FIleReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        try {
		           FileReader reader=new FileReader("C:\\Users\\Veronica\\Downloads\\SUNDARI.txt") ;
		           int character;
		           
		           
		           while((character = reader.read()) != -1)
		           {
		        	 System.out.print((char)character);  
		           }
		 reader.close();
		 	
			        } catch (IOException e) {
		            e.printStackTrace();
		        }
try
{
	FileWriter writer=new FileWriter("C:\\Users\\Veronica\\Downloads\\SUNDARI.txt");
	Files.write(Paths.get("C:\\Users\\Veronica\\Downloads\\SUNDARI.txt"), "i love myself so much that i dont need any dash in my life".getBytes(), StandardOpenOption.APPEND);

	writer.close();
}
catch(IOException e)
{
	e.printStackTrace();
}
	
}
}


