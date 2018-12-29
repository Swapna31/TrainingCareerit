package com.careerIt.practicejava;

import java.util.ArrayList;
import java.util.List;

public class StringManipulations {

	public static void main(String[] args) {
		String statement1="SElenium automaTes mybrowser";
		String statement2="selenium automates mybrowser";
		//to read a Character at particular position
		System.out.println(statement1.charAt(8));
		//Comparing 2 strings
		//it doesnt ignore case
	System.out.println(statement1.equals(statement2));
	
	//Comparing 2 strings by ignoring case
	System.out.println(statement2.equalsIgnoreCase(statement1));
	//SubString func will print the char's from given position
	if(statement1.contains("t"))
	{
		System.out.println("this is the correct string");
	System.out.println(statement1.substring(1));
	}
	System.out.println(statement1.substring(1));
	//Substring func will print the char's from given initial index to end index
	String newstring=statement1.substring(1,9);
	System.out.println(newstring);
	//Concat func will concat 2 strings
	System.out.println(statement1.concat("it is popular"));
	//split function can split the string into parts depends on regexp
	//it will return array
	String[] str1=statement1.split(" ");
	for (String string:str1)
	{
		
	System.out.println(string);
	}
	//index of func will return the index of given char
	System.out.println(statement1.indexOf("t"));
	//isEmpty() func will check whether the given string is empty or not
	System.out.println(statement1.isEmpty());
	//length() func will count each character and gives the lenght of the string
	System.out.println(statement1.length());
	//replace() func will replace the word in given string with new word.
String newstring1=statement1.replace("selenium", "qtp");
System.out.println(statement1 + newstring1);
//tolowercase() will convert the given the string into lowercase
System.out.println(statement1.toLowerCase());
//toUppercase() will convert given string into uppercase
System.out.println(statement1.toUpperCase());
//trim() func will trim the spaces at the beginning and end of the string.
String newT=" selenium ";
System.out.println(newT);
System.out.println(newT.trim());

//length() func will be used for string
//Size() func will be used for list size.
List<String> string2=new ArrayList<String>();
string2.add("hyd");
string2.add("NZB");
string2.add("ADB");
System.out.println(string2);
System.out.println(string2.size());

	}
	
}


