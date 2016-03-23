package com.sundari.third;

public abstract class Animal {
	
	public static int legs=4;
	public static int noOfEars=2;
	protected String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String animalSays();
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
			if(obj instanceof Cow){
				Cow newCow = (Cow) obj;
				if(newCow.animalSays().compareTo(this.animalSays())==0){
					result= true;
				}
			}
		return result;
	}

}
