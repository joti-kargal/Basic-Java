package Module3;

public class ReplaceProblem {

	public static void main(String[] args)
	{
		String s1="Automation Testing";
		String Output=s1.replace('u', 'm');// replace u with m
       System.out.println(Output);
       
       String Output1=s1.replaceFirst("Automation" , "API");//with replace First automation replace API
       System.out.println(Output1);
       
       String Output2=s1.replaceAll("Automation Testing", "Manual testing");
       System.out.println(Output2);
       
       String Output3=s1.replaceFirst(Output1, Output);
       System.out.println(Output3);
       
       String Output4=s1.replaceAll("[a-z]", "");
       System.out.println(Output4);
	}

}
