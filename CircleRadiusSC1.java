package Module1;

import java.util.Scanner;

public class CircleRadiusSC1 {

	public static void main(String[] args)
	//pi*r*r
	{
		double pi=Math.PI;
		System.out.println("Enter the value of radius");
        Scanner s1=new Scanner(System.in);
        double r= s1.nextDouble();
        double area=pi*r*r;
        System.out.println(area);
        s1.close();
	}

}
