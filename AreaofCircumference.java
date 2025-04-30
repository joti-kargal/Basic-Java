package Module1;

import java.util.Scanner;

public class AreaofCircumference {

	public static void main(String[] args)  
	//Circumference of rectangle
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of l ");
		 double l=s1.nextDouble();
		 System.out.println("Enter the value of b ");
		 double b=s1.nextDouble();
		  double Circumferenceofrectangle= 2*(l+b);
		System.out.println(Circumferenceofrectangle);
		s1.close();
		
		//Circumference of Square
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a=sc.nextDouble();
		double CircumferenceOfSquare= 4*a;
		System.out.println(CircumferenceOfSquare);
		
		System.out.println();
		
		//Circumference of circle
		
		double pi=Math.PI;
		System.out.println("Enter the value of radius");
        Scanner sc1=new Scanner(System.in);
		double r= sc1.nextDouble();
		double CircumferenceOfcircle= 2*pi*r;
		System.out.println(CircumferenceOfcircle);
		sc1.close();
        sc.close();
        s1.close();*/
	}
	

}
