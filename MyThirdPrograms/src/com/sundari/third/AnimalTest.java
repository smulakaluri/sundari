package com.sundari.third;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animalOne = new Cow();
		Animal animalTwo = new Dog();
//		Animal animalThree = new Cat();
		
		System.out.println("Animal one says: "+animalOne.animalSays());
		System.out.println("Animal Two says: "+animalTwo.animalSays());
		
		AnimalBarn barn = new AnimalBarn();
		
		Animal animalOne1 = barn.getAnimalOne();
		Animal animalTwo2 = barn.getAnimalTwo();
		
		
		if(barn.animalOne instanceof Cow){
			System.out.println("Animal one is a Cow");
		}else if (barn.animalOne instanceof Dog) {
			
		}
		
	}
}
