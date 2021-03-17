package com.corejava;

import java.util.Arrays;

public class Arrays_Nov13 {
	
	public static void main(String[] args) {
		
		int[] intArray = {34,54,32,12,53,65,55};
		
		System.out.println(" Before sorting the array " + Arrays.toString(intArray));
		
		int[] sortedintArray = sortIntArray(intArray);
		
		System.out.println(" After sorting the array " + Arrays.toString(sortedintArray));		
	}
	
	
	public static int[] sortIntArray(int[] intArray) 
	{
		for ( int i=0; i<intArray.length;i++)
		{
			for(int j=i+1; j<intArray.length;j++)
			{
				int temp = 0;
				
				if (intArray[i] > intArray[j])
				{
					temp = intArray[i];
					intArray[i]=intArray[j];
					intArray[j] = temp;
				}
			}
		}
		return intArray;
		
	}
	
	
	public static void searchElementInArray()
	{
		
		String[] sArray = {"java","Ashrith","student","America"};		
		/*
		for(int i=0; i<sArray.length;i++)
		{
			String str = sArray[i];
			
			if(str.equals("Ashrith"))
			{
				System.out.println(" The required element is present");
			}
			
		}
		*/
		
		for(String m : sArray)
		{
			if (m.equals("Ashrith"))
			{
				System.out.println(" The required element is present");
			}
			
		}
		
	}
	
	
	public static int addNumbers(int a, int b)
	{		
		int sum = a+b;
		return sum;
		
	}
	
	public static String searchElementInStringArray(String[] sArray, String element)
	{
		boolean result = false;
		
		for ( String m : sArray )
		{
			if (m.equals(element)) 
			{				
				result = true;
				break;				
			}			
		}		
		if(result == true)
		{
			return "The element is present";
		}
		else
		{
			return "The element is present";
		}
		
	}

}
