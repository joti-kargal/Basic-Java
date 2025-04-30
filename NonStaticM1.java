package Module1;

public class NonStaticM1 {

	void add()
	{
      int a=10;
      int b=20;
      System.out.println(a+b);
	}
	void add(int a)
	{
		int c=20;
		int d=40;
		System.out.println(c+d);
	}
	void add1(int b)
	{
		int e=20;
		int f=40;
		System.out.println(e+f);
	}
	
	public static void main(String[] args) {
	
		NonStaticM n1=new NonStaticM();
		n1.add();
		NonStaticM n2=new NonStaticM();
		n2.add();
		NonStaticM n3=new NonStaticM();
		n3.add();
		
		
		

	}

	}


