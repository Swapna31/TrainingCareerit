package com.careerIt.oops;

public class Teacher {
	String TeacherName;
	String subTeaches;
	String School;
	public void SetTeacherdetails(String name,String Subject,String School)
		{
		this.TeacherName=name;
		this.subTeaches=Subject;
		this.School=School;
	}
	public void GetTeacherDetails()
	{
		System.out.println("Name is" + TeacherName);
		System.out.println("subject is" + subTeaches);
		System.out.println("School is" + School);
	}

	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.SetTeacherdetails("John","English","Oxford");
		t.GetTeacherDetails();

	}

}
