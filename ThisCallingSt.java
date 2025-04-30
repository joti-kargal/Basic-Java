package Module2;

public class ThisCallingSt {
	
	ThisCallingSt(int a)
	{
		this(1.2);
	
		System.out.println("this calling 1");
	}
	ThisCallingSt(double a)
	{
		this("Jyoti");
		
		System.out.println("this calling 2");
	}
	ThisCallingSt(String name)
	{
	  
		System.out.println("this calling 3");
	}
	public static void main(String[] args) {
		new ThisCallingSt(10);
		

	}

}
