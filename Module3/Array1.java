package Module3;

import java.util.Arrays;

//Two Array are equal to eacg other
public class Array1 {

	public static void main(String[] args) 
	{
		int []input=new int[4];
		input[0]=70;
		input[1]=71;
		input[2]=73;
		input[3]=76;
		
		int []output=new int[4];
		
		for(int i=0;i<input.length;i++)
		{
		output[i]=input[i];
		}
		System.out.println("The input Array is----->"+Arrays.toString(input));
		System.out.println("The output Array is----->"+Arrays.toString(output));
		
	}

}
