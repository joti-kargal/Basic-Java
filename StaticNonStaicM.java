package Module1;

public class StaticNonStaicM 
{

	static void sub()    //Static method
	{
		int a=10;
		int b=5;
	    System.out.println(a-b);
	}
	public void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		
      sub();
      StaticNonStaicM s1=new StaticNonStaicM();
      s1.add();
      
	}

}
