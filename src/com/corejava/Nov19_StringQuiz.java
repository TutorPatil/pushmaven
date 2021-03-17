package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;

public class Nov19_StringQuiz {

	public static void main(String[] args) {
		
		String[] str = {"cat","Test","Bat","mat","Ashrith"};
		
	    System.out.println(Arrays.toString(findNLongWords(str,3)));
		
		/*
		 String[] arr1 = {"cat", "wet", "sat", "cold", "dad", "red"};
		 String[] arr2 = {"wet", "too", "at", "cold", "wet", "cat"};
		
		 int count = matchesCount(arr1,arr2);
		 
		 System.out.println(count);
		 */
		 
		//String[] str = {"cat","Test","Bat","mat","Ashrith"};
		
	    //System.out.println(Arrays.toString(findNLongWords(str,3)));
		
		/*
		
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("Ashrith");
	al.add("test");
	al.add("patil");
	al.add("java");
	al.add("india");
	
	System.out.println(al);
	
	
	ArrayList<String> al1 = removeWordsWithT(al);
	
	
	System.out.println(al1);
	
	*/
	}
	
	public static ArrayList<String> removeWordsWithT(ArrayList<String> AL)
	{
		
	ArrayList<String> AL2 = new ArrayList<String>();
		

	for(int x=0;x<AL.size();x++)
	{
		String s = AL.get(x);
		
		if(s.contains("t"))
		{
			AL2.add(s);
		}		
		
	}
	
	AL.removeAll(AL2);
	
	return AL;
}
	
	 public static String[] findNLongWords(String[] words, int n)             
	 {
		 int counter = 0;
		 
		 for( int i=0; i<words.length;i++)
		 {
			 if(words[i].length()==n)
			 {
				 counter++;
			 }
			 
		 }	 
		 
		 String[] retArr = new String[counter];
		 
		 System.out.println(retArr.length);
		 
		 for (int j=0 ; j<retArr.length;j++)
		 {
				 
		 for (int i=0; i<words.length;i++)
		 {
			String s1 = words[i];
			
			 if(s1.length()==n)
			 {
				retArr[j]=s1;
				
			 }
			 
			 
		 }
		 }
		 return retArr;
		 
	 }
	
	 
	 // String[] arr1 = {“cat”, “wet”, “sat”, “cold”, “dad”, “red”};
	 // String[] arr2 = {“wet”, “too”, “at”, “cold”, “wet”, “cat”};

	 
	 public static int matchesCount(String[] a, String[] b)   	           
	 {
		 int count = 0;
		 
		 for(String m: a)
		 {
			 for(String n: b) {
				 
				 if (m.equals(n))
				 {
					 count++;
					 break;
				 }
			 }
			 
		 }
		 return count ;

	 }


 
	
}
