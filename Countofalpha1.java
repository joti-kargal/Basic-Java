package AssingmentsViVa;

import java.util.Arrays;

public class Countofalpha1 {
      static int countofalpha=0;
      static int countofnumaric=0;
	public static void main(String[] args) 
	
	{
      String s1="123 q w @#";
      
      char[]s=s1.toCharArray();
      System.out.println(Arrays.toString(s));
      
      for(int i=0;i<s1.length();i++)
      {
    	  boolean b=Character.isAlphabetic(s[i]);
    	  
    	 if(b==true)
    	 {
    		 countofalpha++;
    	 }
      }
       System.out.println(countofalpha);

	}

}
