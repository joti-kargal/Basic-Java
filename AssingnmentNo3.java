package AssingmentsViVa;
//this calling statement
public class AssingnmentNo3 {
	
	AssingnmentNo3()
	{
		System.out.println("1");
	}
	AssingnmentNo3(int a)
	{
		this();
		System.out.println("2");
	}
	AssingnmentNo3(double a)
	{
		this(10);
		System.out.println("3");
	}
	
	public static void main(String[] args)
	{
	     new AssingnmentNo3(1.2);
        
	}

}
