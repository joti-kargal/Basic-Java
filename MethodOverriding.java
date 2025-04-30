package Module2;

//Method overriding with three class

   class Mintra{
	   void login()
   {
	    System.out.println("Login to mintra");   
   }
 }  
    class Meshoo extends Mintra {
    	void login()
	   {
    
		   System.out.println("Login to Meshoo");
	   }
   }
   
public class MethodOverriding extends Meshoo  {
	void login()
	   {
		
		   System.out.println("Login to MD");
	   }

	public static void main(String[] args)
	{
		MethodOverriding m1 =new MethodOverriding();
		m1.login();

	}

}
