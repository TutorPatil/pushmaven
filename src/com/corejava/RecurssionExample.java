package com.corejava;

public class RecurssionExample {
	
	
	
	public static int  findFactorial(int num)
	{
		if( num==1)
			return 1;
		else
		{
		int fact =1;
		
		if( num != 0)
		{
			fact = (num * findFactorial(num -1));
		}
		
		return fact;
		}
		
	}
	
	
	
	
	public static int quest0901(int a, int b)
	{
		if ( b==1)
		{
			return a;
		}
		else
		{
			return a + quest0901(a,b-1);
		}
	}
	
	public static int quest0905(int a)
	{
		if(a<=1)
			return 1;
		else
		{
			if (a % 2 ==0)
				return a - quest0905(a-1);
			else
				return a + quest0905(a-1);
		}
	}
	
	
	public static void main(String[] args) {
		
		doSomething(3);
		
	}
	
	
	
	public static void mystery(int n)
	{
		int i;
		
		if (n <=0 )
			return;		
		mystery(n-1);
		
		for(i=0; i<n; i++)
		{
			System.out.print("-");
		}
		
		for(i=0; i<n; i++)
		{
			System.out.print("+");
		}
		
		System.out.println();
		
		
		
	}

	
	public static void quest909(int x) {
		
		
		if(x >= 0) 
			quest909(x-1);
		System.out.print(x + " ");
		
		}
	
	
	public static int linearSearch(int key)
	{
		int[] list = {12,14,15,16,8};
		
		int k = 0;
		boolean found = false;
		
		while(k<list.length && !found)
		{
			if(list[k] == key)
			{
				found = true;
			}
			else
			{
				k++;
			}		
		}
		
		if (found)
			return k;
		else
			return -1;
		
			
		
		
		
		
	}

	
	public static void mysteryMix(String str)
	{
		int len = str.length();
		
		if(len >= 3) 
		{
			mysteryMix(str.substring(0,len/3));
			System.out.print(str.substring(len/3,2*len/3));
			mysteryMix(str.substring(2*len/3));
		}
		
		
	}

	
	public static void doSomething(int n)
	{
		
		if( n > 0)
		{
			doSomething(n-1);
			System.out.print(n);
			doSomething(n-1);
			
			
		}
	}
}
