package Module1;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args)
	{
		/*Scanner s1= new Scanner (System.in);
		//to call the parameterized constructor
		System.out.println("Enter a value of a");
		 int a=s1.nextInt();
		 System.out.println("Enter a value of b");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println(sum);
		s1.close();*/
		
		Scanner s2= new Scanner (System.in);
		System.out.println("Enter the value of a1");
		int a1=s2.nextInt();
		System.out.println("Enter the value of b1");
		int b1=s2.nextInt();
		int sub=a1-b1;
		System.out.println(sub);
		s2.close();
		
		
	}

}
