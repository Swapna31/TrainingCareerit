package com.careerIt.practicejava;

public class staticmethod {

	
	static public void staticmethod()
	{
		System.out.println("Im in static method");
	}
	public void nonstaticmethod()
	{
		System.out.println("im in non - static method");
	}
	
	public static void main(String[] args) {
		
		//no need to create an object for calling static method.
		//we can call directly by using class name
		staticmethod.staticmethod();
		
		
		//if we have non-static method,object creation is must
		staticmethod am1=new staticmethod();
		am1.nonstaticmethod();
	}

}
