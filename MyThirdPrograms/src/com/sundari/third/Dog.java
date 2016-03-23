package com.sundari.third;

public class Dog extends Animal {

	public Dog() {
		super();
		super.name = "DOG";
	}

	@Override
	public String animalSays() {
		return "woof";
	}
	
}
