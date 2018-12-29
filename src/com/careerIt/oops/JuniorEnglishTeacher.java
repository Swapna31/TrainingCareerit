package com.careerIt.oops;

public class JuniorEnglishTeacher extends EnglishTeacher{
int NoOfJuniorEngishStudents;

public void getNoOfJuniorEngishStudents() {
	System.out.println("no of junior English Students are" + this.NoOfJuniorEngishStudents);
}

public void setNoOfJuniorEngishStudents(int noOfJuniorEngishStudents) {
	this.NoOfJuniorEngishStudents = noOfJuniorEngishStudents;
}
public void SetEnglishTeacherDetials(String Name,String sub,String School) {
	SetEnglishTeacherDetails("Kam","Science","OXf");
}
public static void main(String[] args) 
{JuniorEnglishTeacher j=new JuniorEnglishTeacher();
j.setNoOfJuniorEngishStudents(25);
j.getNoOfJuniorEngishStudents();
j.SetEnglishTeacherDetails("Tom","Tel","SSB");
j.GetTeacherDetails();
	
}
}
