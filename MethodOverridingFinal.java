package Module2;
class Msehoo
{
	 final void login()
	{
		System.out.println("login to Meshoo");
	}
}


public class MethodOverridingFinal extends Meshoo{

	  void logout()
	 {
		 System.out.println("login to mintra");
	 }

	public static void main(String[] args) {
	     
		MethodOverridingFinal f1=new MethodOverridingFinal();
		f1.login();

	}

}
