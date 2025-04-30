package AssingmentsViVa;
   
class MethodOveriding
{
	void add()
	{
		System.out.println("1");
	}
}

public class MethodOverriding extends MethodOveriding 
{
      void add()
      {
    	  super.add();
    	  System.out.println("2");
      }
	public static void main(String[] args)
	{
		MethodOverriding m1=new MethodOverriding();
		m1.add();
		

	}

}
