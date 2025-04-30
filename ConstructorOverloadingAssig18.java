package Module1;

public class ConstructorOverloadingAssig18 {
        
	ConstructorOverloadingAssig18()
	{
		System.out.println("Constructor 1");
		
	}
	ConstructorOverloadingAssig18(int a)
	{
		System.out.println("Constructor 2");
		
	}
	ConstructorOverloadingAssig18(double a)
	{
		System.out.println("Constructor 3");
		
	}
	   public static void main(String[] args) 
	{
		  // ConstructorOverloadingAssig18 c1=new ConstructorOverloadingAssig18();
		  // c1.
		   new ConstructorOverloadingAssig18();
		   new ConstructorOverloadingAssig18(10);
		   new ConstructorOverloadingAssig18(1.5);

	}

}
