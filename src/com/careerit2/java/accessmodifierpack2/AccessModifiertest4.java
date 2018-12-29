package com.careerit2.java.accessmodifierpack2;

import com.careerit1.java.accessmodifierspack1.AccessModifierTest1;

public class AccessModifiertest4 {

	public static void main(String[] args) {
	//cant access private var and private methods if tata is class isin another pkg and not inhereted.
		//cant access default var and methods in another pkg if not inherited
		//cant access protected var and methods in another pkg ifnot inherited
		AccessModifierTest1 amd3=new AccessModifierTest1();
		System.out.println(amd3.publicVar);
amd3.publicvaribaleMethod();		
	}

}
