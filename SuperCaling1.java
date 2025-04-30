package Module2;

class SuperCaling{
       {
    	   
	      System.out.println("1");
       }
}

public class SuperCaling1 extends SuperCaling {
	
	SuperCaling1()
	
	{
	    super();	
		System.out.println("2");
	}
	

	public static void main(String[] args) {
		
		 new SuperCaling1();
	}

}
