package com.sundari.scratchpad;

import com.sundari.sampleone.AddClass;

public class Scratch {

	public int a;
	public static String nameOfThisClass="Scratch";
	public AddClass avaialableToAll;
	
	public Scratch(){
	
		
	}
	
	public static void main(String[] args) {
		
		AddClass classOne = new AddClass();
		AddClass classTwo = new AddClass();
		
		classOne.getClass();
	}
	
	public void getAvar(){
		avaialableToAll.getClass();
	}

}
