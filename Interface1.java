package AssingmentsViVa;

interface Book2
{
	void method1();
	void method2();
}
public class Interface1 implements Book2
{
	static void method3()
	{
		System.out.println("calling interface");
	}
	
	public static void main(String[] args)
	{
		Interface1 I1=new Interface1();
		I1.method1();
		I1.method2();
		method3();
		
       
	}

	@Override
	public void method1() 
	{
	System.out.println("Developer write the code here");	
		
	}

	@Override
	public void method2() 
	{
	  System.out.println("Developer write the logic here");
		
	}

}
