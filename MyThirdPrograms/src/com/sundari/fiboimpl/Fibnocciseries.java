package com.sundari.fiboimpl;

public class Fibnocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    long a=0,b=1,c=0;
    
    System.out.println("1. " + a);
//    System.out.println(","); //
    System.out.println("2. " + b);
    for (int i = 1; i < 10; i++) {
		c=a+b;
		System.out.println(i+2 +". "+c);
		a=b;
		b=c;
			}
	
		
	}

}
