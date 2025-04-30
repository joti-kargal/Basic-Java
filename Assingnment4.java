package AssingmentsViVa;
//write program on this calling statement
public class Assingnment4
{
	Assingnment4(int a)
	{
		System.out.println("1");
	}
	Assingnment4(double b)
	{
		this(10);
		System.out.println("2");
	}
	
	Assingnment4()
	{
		this(1.2);
		System.out.println("3");
	}
public static void main(String[] args) 
{
	new Assingnment4();

	}

}
