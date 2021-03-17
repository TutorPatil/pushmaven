package com.corejava;

public class StringsOct10 {
	
	public static void main(String[] args) {
		
		/*
		String s = "Java is interesting selenium will be further interesting";
		
		String[] str = s.split(" ");
		
		for(String m : str)
		{
			System.out.println(m);
		}
		*/
		
		/*
		String s = "Selenium";
			
		System.out.println(s.contains("S"));
		*/
		
		/*
		String s = "selenium";
		//String s1 = s.substring(3);
		
		//System.out.println(s1);
		
		
		String s2 = s.substring(1, 5);
		
		System.out.println(s2);
		*/
		
		/*
		String s = "Selenium";
		
		System.out.println(s.isEmpty());
		
		String s1 = " Automation";
		
		
		
		System.out.println(s.concat(s1));
		
		System.out.println(s+s1);
		
		*/
		
		
		/*
		int x = 205;
		
		// "205"
		
		String s = String.valueOf(x);
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(1));
		
		*/
		
		/*
		double s = 200.59;
		
		String s1 = String.valueOf(s);
		
		System.out.println(s1.length());
		
		*/
		
		
		//String s = "39434@3242a42";
		
		/*
		
		String s = "Selenium";
		
		String s1 = "Selenium";
		
		System.out.println(s.hashCode());
		
		
		System.out.println(s1.hashCode());
		
		Dog d = new Dog();
		
		System.out.println(d.hashCode());
		
		*/
		
		
		//StringBuilder sb = new StringBuilder("selenium");
		
		//sb.append("automation");
		
		//System.out.println(sb);
		
		//sb.deleteCharAt(0);
		
		//System.out.println(sb);
		
		
		//sb.setCharAt(0, 'W');
		
		
		//System.out.println(sb);
		
		//sb.insert(2,"automation");
		
		//System.out.println(sb);
		
		
		String s = "selenium";
		
		String rev="";
		
		for(int x= s.length()-1;x>=0;x--)
			
		{
			rev = rev +s.charAt(x);
		}
		
		System.out.println(rev);
		
		StringBuilder sb = new StringBuilder(s);
		
		
		sb.reverse();
		
		
		System.out.println(sb);
		
		StringBuffer sbu = new StringBuffer();
		
		
		
		
		
		
	}

}
