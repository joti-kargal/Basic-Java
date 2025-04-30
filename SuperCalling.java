package AssingmentsViVa;
class Super
{
	void add()
	{
		System.out.println("Super calling 1");
	}
}
 


public class SuperCalling extends Super 
{
	SuperCalling()
	{
		super();
		System.out.println("Super calling 2");
	}
    
	public static void main(String[] args)
	{
		SuperCalling s1=new SuperCalling();
		s1.add();
	

	}

}
