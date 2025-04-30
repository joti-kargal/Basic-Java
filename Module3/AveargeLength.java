package Module3;

public class AveargeLength {

	public static void main(String[] args)
	{
		int sum=0;
		int nos[]=new int[3];
		nos[0]=5;
		nos[1]=7;
		nos[2]=9;
		
		for(int i=0;i<3;i++)
		{
			sum=sum+nos[i];
		}
		System.out.println(sum);
		double average=sum/nos.length;
		System.out.println(average);


	}

}
