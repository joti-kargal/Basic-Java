package AssingmentsViVa;
interface facebook
{
	 void add1();
	
}

interface twitter extends facebook
{
	void add2();
}
public class MutliLevelInheritance implements twitter {

	public static void main(String[] args) 
	{
		MutliLevelInheritance Mi=new MutliLevelInheritance();
		Mi.add1();
		Mi.add2();

	}

	@Override
	public void add1()
	{
		System.out.println("Logic");
		
	}

	@Override
	public void add2() 
	{
		System.out.println("code");
		
	}

}
