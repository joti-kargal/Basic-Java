package AssingmentsViVa;

public class ThisCalling {
	ThisCalling(int a)
	{
		System.out.println("This calling 1");
	}
	ThisCalling(double b)
	{
		this(60);
		System.out.println("This calling 2");
	}

	public static void main(String[] args) 
	{
		new ThisCalling(1.6);

	}

}
