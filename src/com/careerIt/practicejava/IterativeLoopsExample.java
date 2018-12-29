package com.careerIt.practicejava;

import java.util.ArrayList;
import java.util.List;

public class IterativeLoopsExample {

public static void main(String[] args) {

//while block		
int i=1; //Initialisation
while(i<10) //Condition checking
{
System.out.println("Statement executed multiple times");
i++;//Increment
	}

//incase do while loop the conditionis not checked for the first iteration.
//we dont have controlon first iteration
//do-while block
int j=1;
//for loop block
//initialisation,condition check,statement execution,increment
for(int k=0;k<10;k++)
{
	System.out.println("the iteration number is " + " " + k);
}
	
//for each loop block
//No need for initialisation,incremnt
//foreach is optimized loop than for loop
//foreach will be used for arrays and lists
int[] a= {10,20,30,44,55,66,70};
for(int m:a)
{
	System.out.println("the element is " + m);
}
//break keywork

for(int m=1;m<20;m++)
{
	System.out.println("the element is " + m);
	if(m==15)
	{
		break;
	}
//continue keyword
	for(int n=1;m<20;m++)
	{
		System.out.println("the element is " + m);
		if(n==15)
		{
			continue;	
}
System.out.println("the iteration is" + n);
	}
	}


}
}


