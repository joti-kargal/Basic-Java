package Module2;

    class Mintraa{
    	void login()            //Method overriding with  three classes
    
    	{
    		System.out.println("Login to Mintra");
    	}
    }
    
    class Meshooo extends Mintra{
    	void login()
    	{
    		System.out.println("Login to Meshoo");
    	}
    }    
	
	public class Flipcart extends Meshoo {
		void login()
		{
			System.out.println("Login to flipcart");
		}
	public static void main(String[] args)
	{
	Flipcart f1=new Flipcart();
	f1.login();

    
	

	}

}
