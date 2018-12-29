package com.careerit2.java.accessmodifierpack2;

import com.careerit1.java.accessmodifierspack1.AccessModifierTest1;

public class AccessModifierTest3 extends AccessModifierTest1{


	
	
	public static void main(String[] args) {
		AccessModifierTest3 amd2=new AccessModifierTest3();
		System.out.println("protected variable" + amd2.protectvar);
		amd2.protectedvariableMethod();
		System.out.println(amd2.publicVar);
		amd2.publicvaribaleMethod();
		
		//We cant acess default variable and default methods outside of the pkg even in subclass
		//amd2.defaultvariablemethod();
		//System.out.println(amd2.defaultVaribale);
		
		
	}

}
