package Module3;

import java.util.Arrays;
import java.util.Scanner;

//WAP to accept the values of your array at run time

public class Assingnmentno76 {

	public static void main(String[] args)
	{
      Scanner s1=new Scanner(System.in);
      String []name=new String[2];
      
      for(int i=0;i<name.length;i++)
      {
    	  System.out.println("Please enter the valueof index ---->"+i);
    	  name[i]=s1.next();
      }
      System.out.println(Arrays.toString(name));
      s1.close();


	}

}
