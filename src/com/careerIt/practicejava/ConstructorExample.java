package com.careerIt.practicejava;

//Difference between method and constructor
//method will return value...constructor wont return anything
//constructor name should be same class name
//we can define two constructors  with same name but different  number of  arguements
//i.e we cannot override constructor but we can oveload constror.
public class ConstructorExample {

	int a=20;
	int b=30;
	public ConstructorExample()
	{
		a=25;
		b=35;
		System.out.println("value of a" + a);
		System.out.println("value of b" + b);
	}
	public ConstructorExample(int x,int y)
	{a=x;
	b=y;
		System.out.println("parameterized constructor invocated");
		System.out.println("value of a" + a);
		System.out.println("value of b" + b);
	}
	public static void main(String[] args) {
		ConstructorExample ce=new ConstructorExample();
		ConstructorExample ce1=new ConstructorExample(100,200);
		
	}

}
