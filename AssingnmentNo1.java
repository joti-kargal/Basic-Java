package AssingmentsViVa;

import java.util.Scanner;

//WAP Area of circle using Math class

public class AssingnmentNo1 {
	double pi_value= Math.PI;

	public static void main(String[] args)	{
//	    int r=4;
//	   double area=Math.PI*r*r;
//	   System.out.println(area);

	   
	   
	 //WAP Area of circle using scanner class
	   
	   Scanner s1=new Scanner(System.in);
	   System.out.println("Enter the value of radius");
	   double r=s1.nextDouble();
	   double area =Math.PI*r*r;
	   System.out.println(area);
	  s1.close();
	   
	   
	}
}



//WAP Area of circle using scanner class
