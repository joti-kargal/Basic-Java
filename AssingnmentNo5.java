package AssingmentsViVa;
//this calling statement
public class AssingnmentNo5 {
	
	AssingnmentNo5()
	{
		System.out.println("1");
	}
	AssingnmentNo5(double f)
	{
		this();
		System.out.println("2");
	}
	AssingnmentNo5(String name)
	{
		this(1.4);
	  System.out.println("3");	
	}
	public static void main(String[] args)
	{
		new AssingnmentNo5("Jyoti");

	}

}
