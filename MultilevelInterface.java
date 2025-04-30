package Module2;
interface one
{
	void method1();
	void method2();

}
interface two extends one
{
	void method3();
	void method4();
}

public class MultilevelInterface implements two {

	public static void main(String[] args)
	{
		MultilevelInterface m1=new MultilevelInterface();
		m1.method1();
		m1.method2();
		m1.method3();
		m1.method4();

	}

	@Override
	public void method1() {
		
		System.out.println("Developer write the logic 1");
	}

	@Override
	public void method2() {

		System.out.println("Developer write the logic 2");
	}

	@Override
	public void method3() {
		System.out.println("Developer write the logic 3");
	}

	@Override
	public void method4() {
		System.out.println("Developer write the logic 4");
		
	}

}
