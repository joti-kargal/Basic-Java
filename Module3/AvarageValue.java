package Module3;

public class AvarageValue {

	public static void main(String[] args)
	{
		int sum=0;
		int nos[]=new int[4];
		nos[0]=10;
		nos[1]=14;
		nos[2]=36;
		nos[3]=36;
		
	for(int i=0;i<4;i++)
	{
		sum=sum+nos[i];
	}
	System.out.println(sum);
	double average=sum/nos.length;
	System.out.println(average);
		

	}

}
