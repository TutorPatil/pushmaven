package com.corejava;

public class TestNestedClasses {

	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		out.outerAge = 10;
		System.out.println(out.getOuterAge());
		
		OuterClass.InnerClass in = out.new InnerClass();
		
		in.innerAge = 5;
		System.out.println(in.getInnerAge());
		
		OuterClass.InnerStaticClass inStatic = new OuterClass.InnerStaticClass();
		inStatic.printHello();
		
		

	}

}
