package com.sundari.collecex;

import java.util.ArrayList;
import java.util.List;

import com.sundari.third.Animal;
import com.sundari.third.Cow;
import com.sundari.third.Dog;

public class SimpleSearchList {

	public static void main(String[] args) {
//	       int[] array={11,-10,25,18,45,55,30,87,-28,18};
		
		   List<Animal> elements = new ArrayList<Animal>();
	       System.out.println("The contents of the Array are :");
	       elements.add(new Dog());
	       elements.add(new Cow());
	       
	       Animal animalToBeSearched = new Cow();
	       
	       if(elements.contains(animalToBeSearched)){
	    	   System.out.println("Element found");
	       } else{
	    	   System.out.println("Element not found");
	       }

	}

}
