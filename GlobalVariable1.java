package Module2;

public class GlobalVariable1 {
          int a=10;  //global variables
          int b=20;  //global variables non static variables called instance variables
          
          static int c=10; //global variable for static
          static int d=20;
     
      static void add()
      {
    	  GlobalVariable1 g1 = new GlobalVariable1();
    			  
    	  System.out.println(g1.a+g1.b);
    	  
      }
       static void sub() 
      {
    	   GlobalVariable1 g1=new GlobalVariable1();
    	   
	       System.out.println(g1.a-g1.b);
      }  
      static void mul()
      {
    	System.out.println(c*d);  
      }
      
    
	public static void main(String[] args) 
	{
       
        GlobalVariable1 g1=new GlobalVariable1();  //for non static 
       System.out.println(g1.a); 
       add();
       sub();
       mul();                                     //for static
        
	}

}
