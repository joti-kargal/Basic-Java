package AssingmentsViVa;

class NoteBook
{
	void sub()	
	{
		System.out.println("subtraction1");
	}
}
class Book1 extends NoteBook
{
	void sub()
	{
		super.sub();
		System.out.println("Subtraction2");
	}
}

public class MethodOverriding2 extends Book1 
{
	void sub()
	{
		super.sub();
		System.out.println("Subtraction3");
	}

public static void main(String[] args)
	{
	MethodOverriding2 M1=new MethodOverriding2();
	M1.sub();

	}

}
