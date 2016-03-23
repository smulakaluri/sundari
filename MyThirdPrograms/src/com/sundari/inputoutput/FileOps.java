package com.sundari.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOps {

	public static void main(String[] args) {
		System.out.println("Inside the program");
		File file = new File("C:\\Sundari\\sampleFile.txt");
		try {
			List<String> lines = FileUtils.readLines(file);
			
			for (Iterator iterator = lines.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.println(string);
				
			}
			
			
		} catch (IOException e) {
			//
			System.out.println("OH NO!! there is an IOException");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Last line of the program");
	}
}
