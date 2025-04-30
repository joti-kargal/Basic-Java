package Module3;
//WAP on constructors of a String Buffer and constructors of a String Builder

public class StringBufferandBuilderConstructor {

	public static void main(String[] args)
	{

      StringBuffer sb1=new StringBuffer() ;//16
      System.out.println("StringBuffer 1 (default): " + sb1 + ", Capacity: " + sb1.capacity());

      
      StringBuffer sb2=new StringBuffer("Jyoti");
      System.out.println("StringBuffer 1 (String): " + sb2 + ", Capacity: " + sb2.capacity());

      
      StringBuffer sb3=new StringBuffer(20);
      System.out.println("StringBuffer 1 (capacity): " + sb3 + ", Capacity: " + sb3.capacity());

      StringBuilder sd1=new StringBuilder() ;//16
      System.out.println("StringBuffer 1 (default): " + sd1 + ", Capacity: " + sd1.capacity());

      StringBuilder sd2=new StringBuilder("Ritveej") ;
      System.out.println("StringBuffer 1 (String): " + sd2 + ", Capacity: " + sd2.capacity());

      StringBuilder sd3=new StringBuilder(30) ;
      System.out.println("StringBuffer 1 (String): " + sd3 + ", Capacity: " + sd3.capacity());
	}

}
