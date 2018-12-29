
package com.careerIt.oops;

//Encapsulation is binding data and methods together.
//the advantag of encapsulation is to secute the data from other methods/classes.
//if we declare the methods n data as private,we can access them only in that particular class.
public class Encapsulation_example {

	int employeenumber;
	String empName;
	double empsal;
	
	public void Setnumber(int empNumber)
	{
		this.employeenumber=empNumber;
	}
	public void getEmpNumber()
	{
		System.out.println(this.employeenumber);
	}
	public void SetempName(String empName)
	{
		this.empName=empName;
	}
	public void getempName()
	{
		System.out.println(this.empName);
	}
	public void SetempSal(double eSal)
	{
		this.empsal=eSal;
	}
	public void getempSal()
	{
		System.out.println(this.empsal);
	}	
	
	public static void main(String[] args) 
	{Encapsulation_example enex=new Encapsulation_example();
	enex.Setnumber(11);
	enex.getEmpNumber();
		enex.SetempName("john");
		enex.getempName();
		enex.SetempSal(20000);
		enex.getempSal();
	}
}
