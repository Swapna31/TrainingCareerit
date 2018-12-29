package com.careerIt.practicejava;

public class DatatypePractice {
//Integral data types
	//Byte stores from -128 to 127
	byte bytevar=120;
	//byte bytevar1=-130;
	short shortvar=-32768;
	int intvar=21345666;
	long longvar=45454545454646l;
	
//Floating-point data types	
	
	float floatVar=33.1464f;
	double doubleVar=22434.343d;
	
	
	char charVar='d';
	boolean boolvar=true;
	boolean boolvar1=false;
	
	
	//Non Primitive Data types
	String stringVar="Hyderabad";
	
	//Array declaration
	int[] a= {10,20};
	int[][] arr= {{11,22},{33,44}};
  //  int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 

	

public static void main(String[] args)
{
	DatatypePractice dt=new DatatypePractice();
	for(int i=0;i<dt.arr.length;i++)
	{
		for(int j=0;j<dt.arr.length;j++)
		{
		System.out.println(dt.arr[i][j]);
}
}
}
}
