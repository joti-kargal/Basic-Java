package AssingmentsViVa;
//Super calling statement

class Book
{
	void add()
	{
		System.out.println("Super calling");
	}
}
public class AssingnmentNo6 extends Book
{
	AssingnmentNo6()
	{
		super();
		System.out.println("Call constructor");
	}

	public static void main(String[] args) {
		AssingnmentNo6 a1=new	AssingnmentNo6();
        a1.add();
	}

}
