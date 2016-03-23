package com.sundari.third;

public class Loops {
	
	public static void main(String [] args){
		
		int j=1;
		
		for (int i = 0; i < 10; i++) {
			if(i%2==0){
				continue;
			}else{
				System.out.println(i);
			}
			if(j==3)
				break;
			else
				j++;
		}
		
	}

}
