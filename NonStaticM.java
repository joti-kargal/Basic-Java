package Module1;

public class NonStaticM {

	
	void add()
	{
      int a=10;
      int b=20;
      System.out.println(a+b);
	}
	


public static void main(String[] args)
{
	NonStaticM n1=new NonStaticM();
	n1.add();
}

}