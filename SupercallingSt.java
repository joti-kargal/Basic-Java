package Module2;

    class Super{
     {
       System.out.println("Super calling 1");
     }
  }

public class SupercallingSt extends Super{
	
	SupercallingSt()
	
	{
		super();
		System.out.println("Super calling 2");
	}
	
	
	public static void main(String[] args)
	{
	
       new SupercallingSt();
	}

}
