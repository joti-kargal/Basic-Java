package AssingmentsViVa;

import java.util.Arrays;

//WAP to calculate the alphabates
public class CountOfAlpha {
	   static int countofalpha=0;
	   
	public static void main(String[] args) 
	{
     
		String s=" w r igt @ 5";
		//String output="";
		
		char[]s1=s.toCharArray();
		
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s.length();i++)
		{
			boolean b1=Character.isAlphabetic(s1[i]);
		
		if( b1==true)
		{
			countofalpha++;
			//System.out.println(b1);
		}
		}
		
		   System.out.println(countofalpha);


	}

}

