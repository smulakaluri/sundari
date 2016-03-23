package com.sundari.stringexamples;

public class StringExercises {

	public static void main(String[] args) {
		String one = args[0];
		String two = args[1];
		
		if(one.equals(two)){
			System.out.println("Output from Equal method: true");
		}else {
			System.out.println("Output from Equal method: false");
		}
		
		if(one.equalsIgnoreCase(two)){
			System.out.println("Output from equalsIgnorecase is True");
		}else{
			System.out.println("Output from equalsIgnorecase is false");
		}
		
		System.out.println("Output of compareTo method: "+one.compareTo(two));
		
		System.out.println("Output of compareTo method: "+one.compareToIgnoreCase(two));
	}
}