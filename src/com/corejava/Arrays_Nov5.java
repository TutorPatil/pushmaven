package com.corejava;

public class Arrays_Nov5 {
	
	
public static void main(String[] args) {
	arrayExample2();
}

	public static void arrayExample2()
	{
		int[] x = {10,20,30,40,50};
		
		System.out.println(x.length);
		
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		// for each loop or enhanced for loop
		for(int i : x)
		{
			System.out.println(i);
		}
		
	}




public static void arrayExample1()	
	{
	/*
		int[] x;
		
		x = new int[5];
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;
		
		
		for(int i=0; i<x.length;i++)
		{
			System.out.println(x[i]);
			
		}
		*/
	
	// All in one line
	int[] x = {10,20,30,40,50};
	
	for(int i=0; i<x.length;i++)
	{
		System.out.println(x[i]);
	}
	
	// Ashrith , Devaraju, Student, Java
	
	String[] str;
	
	str = new String[4];
	
	
	str[0] = "Ashrith";
	str[1] = "Devaraju";
	str[2] = "Student";
	str[3] = "Java";
	
	for(int i=0; i<str.length;i++)
	{
		System.out.println(str[i]);
	}
	
	String[] details = {"Ashrith","Devaraju","Student","Java"};
	
	details[3] = "Arrays";
	
	for(int i =0; i<details.length;i++)
	{
		System.out.println(details[i]);
	}
	
	
	for(String m : details)
	{
		System.out.println(m);
	}
	
	System.out.println("================");
	
	char[] c = {'a','b','c','d','e'};
	
	for(int i=c.length-1;i>=0;i--)
	{
		System.out.println(c[i]);
	}
	
	for(char m : c)
	{
		System.out.println(m);
	}
	
	
	
		
		
		

	}
	
}
