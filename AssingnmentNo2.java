package AssingmentsViVa;

import java.util.Scanner;

//WAP if persons age is under senior citizen i.e 60
public class AssingnmentNo2 {

	public static void main(String[] args) 
	{
//		 int person_age = 60;
//		if(person_age<60)
//		{
//			System.out.println("Person is not Senior citizean");
//		}
//		else
//		{
//			System.out.println("Person is Senior citizean");
//		}
//		

	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the person age");
		int age1=s1.nextInt();
		
		if(age1<60)
	{
		System.out.println("Person is not  Senior citizean");
	}
	else
	{
				System.out.println("Person is  Senior citizean");
	}
		s1.close();
	}
 
}
