package Module1;

public class SIBAndIIB {
	static
	{
		System.out.println("SIB 1");
	}
	SIBAndIIB()
	 
	{
		System.out.println( "constructor");
		
	}

	{
		System.out.println( "IIB 1");
	}
	public static void main(String[] args)
	{
	  System.out.println("Main Method");
	  new SIBAndIIB();

	}

}
