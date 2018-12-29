package com.careerIt.oops;

public class EnglishTeacher extends Teacher{
 int NoEngStudents;
 
public void getSet() {
	System.out.println("total no of students"  + this.NoEngStudents);
}
public void setSet(int NoStudents) {
this.NoEngStudents = NoStudents;
}
public void SetEnglishTeacherDetails(String Name,String Sub,String School)
{
	SetTeacherdetails(Name,Sub,School);
}
public static void main(String[] args) 
{
	EnglishTeacher e=new EnglishTeacher();
	e.SetEnglishTeacherDetails("Kim","maths","Cambridge");
	e.GetTeacherDetails();
}
}
