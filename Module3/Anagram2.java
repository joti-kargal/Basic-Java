package Module3;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) 
	{
        String st1="race";
        String st2="care";
        
        if(st1.length()!=st2.length())
        {
        	System.out.println("They are not Anagram");
        }
        else 
        {
        	char []ch1=st1.toCharArray();
        	char []ch2=st2.toCharArray();
        	
        	Arrays.sort(ch1);
        	Arrays.sort(ch2);
        	
        	boolean b2=Arrays.equals(ch1, ch2);
        	if (b2==true)
        	{
        		System.out.println("Given 2 String is Anagram");
        	}
        	else
        	{
        		System.out.println("Given 2 String is not Anagram");
        }
        


        }
	}
}


