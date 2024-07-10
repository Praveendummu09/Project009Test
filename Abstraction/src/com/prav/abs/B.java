package com.prav.abs;

public class B extends A{

	public static void main(String[] args) {
		B ob=new B();
		ob.show();
		ob.post();
		ob.display();
	}

	@Override
	void show() {
		System.out.println(" Show");
	
		
	}

	void display() {
		System.out.println(" Display");
	}
	
		
}
