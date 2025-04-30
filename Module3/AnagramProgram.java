package Module3;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) 
	{

       String s1="act";
       String s2="mom";
       	
       if(s1.length()!=s2.length())
       {
    	   System.out.println("String are not Anagram");
       }
       else
       {
    	  char[] c1= s1.toCharArray();       //[a,c,t]
    	  char[] c2=s2.toCharArray();           //[c,a,t]
    	  
    	  Arrays.sort(c1);    //[a,c,t]
    	  Arrays.sort(c2);    //[a,c,t]
    	  
    	  //compare two array
    	  
    	  boolean b1=Arrays.equals(c1, c2);
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
