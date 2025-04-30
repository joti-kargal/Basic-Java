package Module3;

public class AssingmentNo84 {

	public static void main(String[] args) 
	{
      String s="Jyoti Waghmode";
      String output= s.replace("Waghmode", "Rahul"); //Replace Function
      System.out.println(output);
      
      String output1=s.replaceAll("Jyoti", "Jyo");//Replace All
      System.out.println(output1);
      
      boolean output2=s.matches("..... ........");//matches
      System.out.println(output2);
      
      boolean output3= s.matches("J(.*)");//matches
      System.out.println(output3);
     
      String output4=  s.repeat(2);//Repeat
      System.out.println(output4);
      
      String output5=s.substring(1);//substring
      System.out.println(output5);
    
      
	}

}
