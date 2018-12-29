package com.careerIt.oops;

public class PhysicsTeacher extends Teacher{
int NoOfPhysicsStudents;

public void getNoOfPhysicsStudents() {
	System.out.println(this.NoOfPhysicsStudents);
}

public void setNoOfPhysicsStudents(int noOfPhysicsStudents) {
	this.NoOfPhysicsStudents = noOfPhysicsStudents;
}
public void SetPhysicsTeacherDetails(String name,String Sub,String School)
{
	SetTeacherdetails(name,Sub,School);
}
public static void main(String[] args) 
{
	PhysicsTeacher p=new PhysicsTeacher();
	p.setNoOfPhysicsStudents(45);
	p.getNoOfPhysicsStudents();
	p.SetPhysicsTeacherDetails("Tam","math","ISB");
	p.GetTeacherDetails();
}
}
