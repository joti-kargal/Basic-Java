package Module2;

abstract class AbstactsClassProgramm
{
abstract void login();
}
public class AbstractCM extends AbstactsClassProgramm{
	 
	static void add()
	{
		System.out.println("Addition");
	}
    void sub()
    {
    	System.out.println("Subtraction");
    	
    }
    
    public static void main(String[] args) {
	add();
	AbstractCM A1=new AbstractCM();
	A1.sub();

	}
	
	void login()
	{
		System.out.println("Login to flipcart");
		
	}
	
	
}
