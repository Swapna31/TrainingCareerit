package com.careerit1.java.accessmodifierspack1;

public class AccessModifierTest1 {

	
	private int privateVariable=100;
	int defaultVaribale=100;
	protected int protectvar=100;
	public int publicVar=50;
	
	private void privateMethod()
	{
		System.out.println("Private method of AccessmodifierTest1");
	}
	 void defaultvariablemethod()
	{
		System.out.println("default method");
	}
	 protected void protectedvariableMethod()
	{
		System.out.println("this is protected method");
	}
	 public void publicvaribaleMethod()
	 {
		 System.out.println("this is public method");
	 }
	
public static void main(String[] args)
{
	AccessModifierTest1 amt1=new AccessModifierTest1();
	System.out.println(amt1.privateVariable);
	amt1.privateMethod();
	System.out.println(amt1.defaultVaribale);
	amt1.defaultvariablemethod();
	amt1.protectedvariableMethod();
	System.out.println(amt1.protectvar);
	
}

	
	
}
