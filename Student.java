package Module1;
//In a single class can we have static,non Static and constructor?
//1 Static
//1 non Static
//1 constructor

public class Student {
	//In a single class can have static,non static and constructor?
	
	static void add()  // Static Method
	
	   {
	 
	        System.out.println("Static Method");
	   }
	
	
	
	void add(int a)     //Non Static Method
	{
		
		   System.out.println("Non Static Method");
	}
	
	public Student() // constructor
	{
		
		   System.out.println("call constructor");
		   
	}
	

		public static void main(String[] args) 
	{
	        add();
	        Student s1=new Student();
		    s1.add(0);
		  
		      
	    		  
	      

	}

}
