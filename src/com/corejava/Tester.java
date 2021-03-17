package com.corejava;

public class Tester {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		
		c.colour = "Blue";		
		c.engineCapacity = 1200;		
		c.isAutomatic = true;		
		c.noOfGears = 5;
		
		
		c.drive();
		c.fillFuel();
		
		System.out.println(c.noOfWheels);
		
		c.noOfWheels = 5;
		
		System.out.println("=========");
		
		Car c1 = new Car();
		
		System.out.println(c1.noOfWheels);
		
		c1.colour = "Black";		
		c1.engineCapacity = 1500;		
		c1.isAutomatic = false;		
		c1.noOfGears = 4;
		
		
		c1.drive();
		c1.fillFuel();
		
		/*
		c=c1;
		
		
		System.out.println(c.colour);
		System.out.println(c1.colour);
		
		
		c.drive();
		c1.drive();
		*/
		
		/*
		c=null;
		
		System.out.println(c.colour);
		
		*/
		
		System.out.println("============");
		
		c.colour = "white";		
		c.engineCapacity = 2000;		
		c.drive();
		
		
	}

}
