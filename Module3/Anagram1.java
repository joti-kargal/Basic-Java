package Module3;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args)
	{
		String a1="Earth";
		String a2="Heart";
		
		 if(a1.length()!=a2.length())
		{
			System.out.println("String is not Anagram");
		}
		else
		{
			char []c1=a1.toCharArray();
			char []c2=a2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
	boolean b1=	Arrays.equals(c1, c2);
	if(b1==true)
	{
		System.out.println("Two strings are anagram");
	}
	else
	{
		System.out.println("Two strings are not anagram");
	}
			
		}
		
		
	}

}
