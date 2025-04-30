package Module3;

public class Matches {

	public static void main(String[] args) 
	{
      String s="Care";
      //1st check if the given string consist of extra 4 letters in it or not
      boolean b1=s.matches("....");
      System.out.println(b1);
      //check if the string start with c
      boolean b2=s.matches("C(.*)");
      System.out.println(b2);
      //check with my given ends with e
      boolean b3=s.matches("(.*)e");
      System.out.println(b3);
      //Check in middle letters a r
      boolean b4=s.matches("C(.*)e");
      System.out.println(b4);
      
      //check the given string have man in it
      String s1="Spiderman";
      //superman
      //hanuman
      //ironman
     // Salman khan
      //manager
      //
    // boolean b= s1.matches("(.*)man");
     //System.out.println(b);
     //check first man in given string
    // boolean b5=s1.matches("man(.*)");
   //  System.out.println(b5);
     //check if the man in middle
    // boolean b6=s1.matches("(.*)man(.*)");
    // System.out.println(b6);
     
     boolean b7=s1.matches("(.*)man(.*)");
     System.out.println(b7);
 
     
	}

}
