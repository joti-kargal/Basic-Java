package Module2;

    class ParrentClass
   {
	void login()
	  {
	     System.out.println("Login with Email id");
       }
   }
    
public class ChildClassMOverriding extends ParrentClass 
{
	void login()
       {
		super.login();
	     System.out.println("Login with Mobile no.");
       }

	public static void main(String[] args) 
	{
		ChildClassMOverriding c1=new ChildClassMOverriding();
		c1.login();
	}

}
