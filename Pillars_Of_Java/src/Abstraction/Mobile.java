package Abstraction;

public abstract class Mobile {
	void calls()
	{
		System.out.println("Mobile phon can make a calls ");
	}
	void chat()
	{
		System.out.println("by using Mobile we can do Chating");
		
	}
	abstract void capture();
	abstract void gps();
	abstract void transactions();
}
