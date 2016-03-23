package com.sundari.third;

public class Arraystrings {

	public static void main(String[] args) {
		
		String [] StringArray = {"sundari","mallika","sanjana","vaishu","saharsh"};
		int j= 0;
		
		
		System.out.println(StringArray.length);
		
		for (int i = 0; i < StringArray.length; i++) {
			if (args[0].equals(StringArray[i]))
			{
				System.out.println(StringArray[i] + " matches the string passed as argument");
				j= 1;
				break;
			}
			
			if (j == 0) {
				System.out.println("No Match");
			}
			
				
		}

		
	}	

	}