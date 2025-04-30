package Module3;

import java.util.Arrays;

public class Array {

	public static void main(String[] args)
	{
       String[] name=new String[3];
       
       name[0]="Jyoti";
       name[1]="Ritveej";
       name[2]="Dada";
       
       
       for(int i=0;i<3;i++)
       {
          System.out.println(name[i]);
       }
       System.out.println(Arrays.toString(name));
       Arrays.sort(name);
       
	} 

}
