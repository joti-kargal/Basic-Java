package Module2;
class Flipkart {	
	Flipkart(String name)
	{
		System.out.println("Third Constructor");
	}
}
class Google extends Flipkart {
	 Google(char a)
	 {
		 super("Jyoti");
		 System.out.println("first Constructor");
	 }
 }
	public class Amazone extends Google {
		Amazone()
		{
         super('J');
		System.out.println("Second Constructor");
			}
		public static void main(String[] args)
	{
			new Amazone();

	}

}
