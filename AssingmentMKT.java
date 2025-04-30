package Module1;

//In a single class can we have static,non Static and constructor?
//2 Static
//2 non Static
//2 constructor

public class AssingmentMKT {
	//Static Method
	
	static void add() 
	{
		System.out.println("Static Method");
	}
	static void add(int a)
	{
		System.out.println("Static Method1");
	}
	
	//Non static Method
	
	void add(double b)	
	{
		System.out.println("Non static Method ");
	}
	
	void add(char a)
	
	{
		System.out.println("Non static method 1");
	}
	//Constructor
	public AssingmentMKT()
	{
		System.out.println("first constructor");
	}
	public AssingmentMKT (char a)
	{
		System.out.println("second constructor");
	}

	public static void main(String[] args) 
	{
		add();
		add( 20);
		AssingmentMKT a1=new AssingmentMKT();
		a1.add(1.2);
		//AssingmentMKT a2=new AssingmentMKT();
		a1.add('A');
		new AssingmentMKT('B');
		
		
		

	}

}
