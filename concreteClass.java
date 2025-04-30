package Module2;
abstract class AbstractClassProgram
{
     abstract void login();	
     abstract void logout();	
}
public class concreteClass extends AbstractClassProgram  {
	static void add()
	{
		
	}
	void sub()
	{
		
	}

	public static void main(String[] args)
	{
	

	}
	@Override
	void login()
	{                  //Concrete method
		System.out.println("logic");
		
	}
     void logout()	
     {
    	 
     }

}
