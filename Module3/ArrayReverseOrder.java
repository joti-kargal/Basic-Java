package Module3;

import java.util.Arrays;

//WAP to copy one array into another array 
public class ArrayReverseOrder {

	
	public static void main(String[] args)
	{
		int []input=new int[4];
		input[0]=70;
		input[1]=14;
		input[2]=53;
		input[3]=86;
		int[] output=new int[input.length];
		
		for(int i=3,j=0;i>=0;i--,j++)
		{
		output[j]=input[i];
		}
		System.out.println("The input Array is----->"+Arrays.toString(input));
		System.out.println("The input Array is----->"+Arrays.toString(output));
	}

}
