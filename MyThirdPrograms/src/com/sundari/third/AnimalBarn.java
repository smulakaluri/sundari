package com.sundari.third;

public class AnimalBarn {
	
	Animal animalOne= new Cow();
	Animal animalTwo = new Dog();
	public Animal getAnimalOne() {
		return animalOne;
	}
	public void setAnimalOne(Animal animalOne) {
		this.animalOne = animalOne;
	}
	public Animal getAnimalTwo() {
		return animalTwo;
	}
	public void setAnimalTwo(Animal animalTwo) {
		this.animalTwo = animalTwo;
	}
}