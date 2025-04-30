package Module2;

public class palindromeNumber {

	public static void main(String[] args)
	{
	   String s1="MoM";
	   String Output="";
	   for(int i=s1.length()-1;i>=0;i--)
	   {
		   char s=s1.charAt(i);
		   Output=Output+s;
		  // System.out.println(Output);
	   }
	   System.out.println(Output);
	   
	   if (s1.equals(Output))
	   {
		   System.out.println("String is palindrome");
	   }
	   else
	   {
		   System.out.println("String is not palindrome");
	   }
	   }

	}


