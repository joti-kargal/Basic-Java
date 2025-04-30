package Module2;

public class LocalVariable {
	
	static void add()
	{
		System.out.println("Local variable inside the static Method");
	}
	void add(int a)
	{
		System.out.println("Local variable inside the Non static Method");
	}

	public static void main(String[] args) 
	{
	add();
	LocalVariable l1=new LocalVariable();
	l1.add(10);

	}

}
