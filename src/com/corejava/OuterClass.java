package com.corejava;

public class OuterClass {
	
	int outerAge;
	
	public int getOuterAge() {			
		
		return outerAge;
	}	
	
	
	class InnerClass{
		
		int innerAge;
		
		public int getInnerAge()		
		{
			System.out.println(outerAge);
			InnerPrivateClass inPrivate = new InnerPrivateClass();
			inPrivate.printPrivateMessage();
			return innerAge;
		}	
		
		
	}
	
	static class InnerStaticClass{
		
		public void printHello()
		{
			
			System.out.println("Hello from inner class");
		}
		
	}
	
	private class InnerPrivateClass
	{
		
		public void printPrivateMessage()
		{
			System.out.println(" Hello this is a provate message");
		}
	}

}
