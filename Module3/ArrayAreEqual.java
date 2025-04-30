package Module3;

import java.util.Arrays;
//WAP to check if 2 arrays are equals to each other at run time
public class ArrayAreEqual {

	public static void main(String[] args)
	{
       int a1[]= {1,2,3,4};
       int a2[]= {1,2,3,4};
       
      boolean b1= Arrays.equals(a1, a2);
      if(b1==true)
      {
    	  System.out.println("Two Arrays are equals");
      }
      else
      {
    	  System.out.println("Two Arrays are not equals");
      }
      }

	}


