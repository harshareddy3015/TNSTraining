package com.tns.oops;

public class PolymorphismMain {

	public static void main(String[] args) {
		Polymorphism obj=new Polymorphism();
		
		System.out.println(obj.add(5, 5));
		System.out.println(obj.add(5.2f, 5.4f));
		
		
		RuntimePolymorphism rp=new RuntimePolymorphism();
		Child rpc=new Child();
		rp.printmsg();
		rpc.printmsg();

	}

}


