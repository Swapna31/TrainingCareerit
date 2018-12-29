package com.careerIt.practicejava;

public class Java_ThisKeyword_demo {

	int instanceVar=500;
	String name="Selenium";
	
	public void sampleMethod()
	{
		int instanceVar=600;
		String name="java";
		System.out.println(this.instanceVar);
		System.out.println(this.name);
		System.out.println(name);
		System.out.println(instanceVar);
	}

public static void main(String[] args)
{
	Java_ThisKeyword_demo jtk=new Java_ThisKeyword_demo();
	jtk.sampleMethod();
}
}