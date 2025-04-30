package AssingmentsViVa;

 abstract class facebook1
 { 
      abstract void login();
 }
public class abstractclass extends facebook1
{
     static void add()
     {
    	 System.out.println("Add");
     }
     void sub()
     {
    	 System.out.println("Sub");
     }
	public static void main(String[] args)
	{
		abstractclass Ab=new abstractclass();
		Ab.sub();
		add();
		
	}

	@Override
	void login() {
		System.out.println("logic");
		
	}

}
