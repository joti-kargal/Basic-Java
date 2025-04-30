package Module3;

import java.util.Arrays;

public class ToStringSortMethode {

	public static void main(String[] args) 
	{
        /*int [] num= {27,78,45,89,90,39};
      
      System.out.println(Arrays.toString(num));
      Arrays.sort(num);
      System.out.println("Sorted Array----->"+Arrays.toString(num));*/
		
		String []name=new String[3];
		name [0]="Ram";
		name [1]="Shaym";
		name [2]="Jyoti";
		
          System.out.println("Oroginal String[]---->"+ Arrays.toString(name));//Original String Array
	        Arrays.sort(name);
		  System.out.println("Sorted Array----->"+Arrays.toString(name));//Sorted Array
		
  }
		
		
}


