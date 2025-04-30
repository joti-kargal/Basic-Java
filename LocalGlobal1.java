package Module2;

public class LocalGlobal1 {
	int a=100;
    static int days=31;


	public static void main(String[] args)
	{
		//How to update the value of local variable 
		int b=20;
		b=50;
		System.out.println(b);
		
		//how to update the value of global variable
		days=30;
		System.out.println(days);
		LocalGlobal1 l1=new LocalGlobal1();
		l1.a=200;
		System.out.println(l1.a);
       
	}

}
