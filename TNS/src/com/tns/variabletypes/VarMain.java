package com.tns.variabletypes;

public class VarMain {

	public static void main(String[] args) {
		
		VarTypesDemo ob= new VarTypesDemo();
		ob.numone=23;
		ob.number=34;
		
		int result=ob.numone=10;
		
		System.out.println("This is instance variable output"+result);
		ob.display();
		
		System.out.println("This is static variable output"+VarTypesDemo.numthree);
		 
	}

}