package Module1;

import java.util.Scanner;

public class AreaOfRectSC2 {

	public static void main(String[] args) 
	{
	    //Area of rectangle=a*b
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=     s1.nextInt();
		System.out.println("Enter the value of b");
		int b=     s1.nextInt();
		
		 int rectangle=a*b;
		System.out.println(rectangle);
		s1.close();

	}

}
