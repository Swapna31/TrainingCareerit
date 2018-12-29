package com.careerIt.JavaAssignment;

public class SimpleClass {
	int a;
	String name;
	public void samplemethod1()
	{
		System.out.println("This is Sample method1");
			}
	public void samplemethod2()
	{
		System.out.println("This is Sample method2");
			}		

	public static void main(String[] args) {
		SimpleClass s=new SimpleClass();
	s.a=10;
	System.out.println(s.a);
	s.name="John";
	System.out.println(s.name);
	s.samplemethod1();
	s.samplemethod2();
	
	}

}
