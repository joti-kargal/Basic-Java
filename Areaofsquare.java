package Module1;

import java.util.Scanner;

public class Areaofsquare {

	public static void main(String[] args)
	{
		 //Area of Square=a*a
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
	    double a=   s1.nextDouble();
	     double area=a*a;
	     System.out.println(area); 
	     
	    //Area of triangle
	     Scanner s2=new Scanner(System.in);
		 System.out.println("Enter the value of b");
		 double b=   s2.nextDouble();
		 System.out.println("Enter the vakue of h");
		 double h=   s2.nextDouble();
		 double triangeArea=0.5*b*h; 
		 System.out.println(triangeArea);
		 s2.close();
		 s1.close();
		 
			
		
		
		

	}

}
