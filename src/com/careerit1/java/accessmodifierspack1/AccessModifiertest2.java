package com.careerit1.java.accessmodifierspack1;

public class AccessModifiertest2 extends AccessModifierTest1 {
	//AccessModifierTest1 amd1=new AccessModifierTest1();
	public static void main(String[] args) {
		
		AccessModifierTest1 amd1=new AccessModifierTest1();
		
		//not able to access private variable of super class
		
		System.out.println(amd1.defaultVaribale);
		amd1.defaultvariablemethod();
		System.out.println(amd1.protectvar);
		amd1.protectedvariableMethod();
		System.out.println(amd1.publicVar);
		amd1.publicvaribaleMethod();
	}

}
