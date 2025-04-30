package Module2;

public class localglobal2 {
	
	int employee_id=1234;
	

	public static void main(String[] args)
	{
		 int employee_id =2345;
		 
		System.out.println(employee_id);//change value in local
		
		
		localglobal2 l1= new localglobal2();
		l1.employee_id=4567;
		System.out.println(l1.employee_id);//for global variable update the value.
		
		


	}

}
