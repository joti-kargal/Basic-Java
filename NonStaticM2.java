package Module1;

public class NonStaticM2 {

	

	void methodOne()
	{
       System.out.println("Methode One ");
	}
	void methodTwo()
	{
		System.out.println("Method two");
	}
	void methodThree()
	{
		System.out.println("Method three");
	}


public static void main(String[] args)
{
	NonStaticM2 n1=new NonStaticM2();
	n1.methodOne();
	NonStaticM2 n2=new NonStaticM2();
	n2.methodTwo();
	NonStaticM2 n3= new NonStaticM2();
	n3.methodThree();
	
}
}