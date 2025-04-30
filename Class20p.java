package Module2;

import java.util.Arrays;
//String=alpha+numeric+space+special

public class Class20p {
    static int countofaplha=0;
    static int countofnumaric=0;
    static int countofspace=0;
 
	public static void main(String[] args)
	{
       String s1="st e 5 @";
       
       char[]ch=s1.toCharArray();
       System.out.println(Arrays.toString(ch));
        
       for(int i=0;i<s1.length();i++)
 {
       boolean b=Character.isAlphabetic(ch[i]);
       boolean b1=Character.isDigit(ch[i]);
       boolean b2= Character.isWhitespace(ch[i]);
       if(b==true)
       {
    	   countofaplha++;
       }
       if(b1==true)
       {
    	   countofnumaric++; 
       }
       if(b2==true)
       {
    	   countofspace++;
       }
 }
       System.out.println("count of alphabets----->" +countofaplha);
       System.out.println("Count of Numbers------->" +countofnumaric);
       System.out.println("Count of Space------->" +countofspace);
       int NOofspecialchar=s1.length()-(countofaplha+countofnumaric+countofspace);
       System.out.println("Count of NOofspecialchar------->" +NOofspecialchar);
       
       }
       
	}

	


