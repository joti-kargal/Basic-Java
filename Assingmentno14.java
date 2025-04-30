package Module1;

public class Assingmentno14 {
	void add()
	{
	   System.out.println("call non static Methode 1");
	}
	void add(int a)
	{
		System.out.println("call non static Methode 2");
	}
	void add(double a)
	{
		System.out.println("call non static Methode 3");
	}


	public static void main(String[] args)
	{
		  
		NonStaticMethodAss14 n1 =new NonStaticMethodAss14();
	    n1.add();
	    n1.add(10);
	    n1.add(1.4);
	}

}
