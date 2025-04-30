package Module2;
interface three
{
	void method3();
}
interface four
{
	void method4();
}
public class Mutipleinheritance implements three,four{

	public static void main(String[] args) 
	{
		Mutipleinheritance M1=new Mutipleinheritance();
		M1.method3();
		M1.method4();

	}

	@Override
	public void method4() 
	{
		System.out.println("Develper will write the logic here 3");	
	}

	@Override
	public void method3() 
	{
		System.out.println("Develper will write the logic here 4");	
	}

}
