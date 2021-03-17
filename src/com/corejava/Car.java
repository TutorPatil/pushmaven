package com.corejava;

public class Car {
	
	String colour ;
	int noOfGears;
	int engineCapacity;
	boolean isAutomatic;
	static int noOfWheels = 4;
	
	
	public void drive()
	{	
		int x = 20;	
		System.out.println("The car of the colour "+
		colour +" with the capacity  "+engineCapacity +" is been driven");
	}
	

	public void fillFuel()
	{		
		System.out.println("The car of the colour "+
		colour +" with the capacity  "+engineCapacity + "which is Automatic "+isAutomatic +" its fuel got over");
	}
	
}
