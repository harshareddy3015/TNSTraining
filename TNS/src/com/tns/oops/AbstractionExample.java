package com.tns.oops;

public abstract class AbstractionExample {
	public abstract void printmsg();
}

class Implementabs extends AbstractionExample{
	public void printmsg() {
		System.out.println("Iam Implementing the abstract class printmsg method");
	}
}