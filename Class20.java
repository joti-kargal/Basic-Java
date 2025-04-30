package Module2;

import java.util.Arrays;
//WAP of calculate the alphabets
public class Class20 {
     static int countofalpha=0;
	public static void main(String[] args)
	{
		String s="K v no 5";
		//String output="";
		
		char [] s1=s.toCharArray();
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<8;i++)
		{
		boolean b1=Character.isAlphabetic(s1[i]);
		
		if (b1==true)
		{
	         countofalpha++;
		}
	           //System.out.println(b1);
		}
		System.out.println(countofalpha);
	}

}
