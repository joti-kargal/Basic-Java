package Module3;
//WAP to accept the value of array at run time in string data type
import java.util.Arrays;
import java.util.Scanner;

public class ArrayHumanInput {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
     String[] name=new String[3];
     
     
     for(int i=0;i<name.length;i++)
     {
    	System.out.println("please enter the value of index---->" +i);
        name[i]=s1.next();
    
	}
     System.out.println(Arrays.toString(name));
     
     s1.close();

	}
}

