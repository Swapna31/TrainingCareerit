package com.careerIt.oops;
//Runtime polymorphism can be achieved by methodoverriding.
//i.e which method(parent/child class) will run will be decided at the run time.
public class Java_MethodoverridingChild extends Java_MethodoverridingParent{
public void rateofInterest(float d)
{System.out.println("Rate of Interest" + d);
	
}
public static void main(String args[])
{
	Java_MethodoverridingChild obj=new Java_MethodoverridingChild();
	obj.rateofInterest(8.1f);
	
}
}
