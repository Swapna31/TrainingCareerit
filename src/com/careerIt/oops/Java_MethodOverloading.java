package com.careerIt.oops;
//Compile time polymorphism can be achieved by Method Overloading.
//Which method is going to be executed will be decided at compile time.
public class Java_MethodOverloading {
public void additionOfTwoNumbers()
{
	int a=100;
	int b=200;
	System.out.println("Addition of two numbers" + " " +(a+b));
}
public void additionOfTwoNumbers(int a,int b)
{int result=a+b;
	System.out.println("Addition of two numbers with two params" + " " +result);
}
public void additionOfTwoNumbers(String x,String y)
{	int result=Integer.parseInt(x)+Integer.parseInt(y);
	System.out.println("addition of two numbers of different type" +" " +result);
}

public static void main(String args[])
{Java_MethodOverloading jml=new Java_MethodOverloading();
jml.additionOfTwoNumbers();
jml.additionOfTwoNumbers(25, 25);
jml.additionOfTwoNumbers("200","300");
	
}
}
