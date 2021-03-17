package com.corejava;

public class CoreJava_Ashrith_23 {
	
	public static void main(String[] args) {
		
		// 2D array
		
		// int[] num = new int[3];
		
		int[][]x = new int[3][];
		
		x[0] = new int[3];
		
		x[1] = new int[5];
		
		
		x[2] = new int[4];
		
		
		int[][] y = new int[6][8];
		
		int[][] z = new int[4][];
		
		z[0] = new int[2];
		z[1] = new int[3];
		z[2] = new int[4];
		z[3] = new int[5];
		
		int[] m = {10,20,30};
		
		int[][] twoDArray = {{1,2,3,4},{2,3,4},{1,2,3,4,5,6,7},{2,3,4,55}};
		
		
		for( int i=0; i<twoDArray.length;i++)
		{
			for(int j=0;j<twoDArray[i].length; j++)
			{
				System.out.println(twoDArray[i][j]);
			}
			
			
		}
		
		// int[][] twoDArray = new int[4][];
		
		// twoDArray[0] = new int[4]
		// twoDArray[1] = new int[3]
		// twoDArray[2] = new int[7];
		// twoDArray[1] = new int[4]
		
		
		
		// String[][] str = new String[2][3];
		
		
		String[][] str = new String[2][];
		
		str[0] = new String[4];
		str[1] = new String[5];
		
		for(int i=0; i<str.length; i++)
		{
			for(int j =0; j<str[i].length;j++)
			{
				System.out.println(str[i][j]);
			}
		}
		
		System.out.println("++++++++++++++++++++");
			
		for( int[] a : twoDArray)
		{
			for ( int b : a)
			{
				System.out.print(b);
			}
			System.out.println("============");
		}
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}
	
}
	
	


