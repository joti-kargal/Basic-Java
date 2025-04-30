package Module2;

public class String1 {

	public static void main(String[] args)
	{
		String s="School";
		boolean s1=s.equals("College");
		System.out.println(s1);
		
		//String c="School";
		boolean c1=s.equals("School");
		System.out.println(c1);
		
		boolean b2=s.equalsIgnoreCase("SCHOOL");
		System.out.println(b2);
		
		String s11="Jyoti Dadasaheb Waghmode";
		boolean s4=s11.contains("Dadasaheb");
		System.out.println(s4);
		
		String t="jyoti";
		String t1=(t.concat(" Waghmode"));
		System.out.println(t1);
		
		String s2="ritveej";
		String w=s2.substring(4);
		System.out.println(w);
		
		char s5=s2.charAt(2);
		System.out.println(s5);
		//int s6=s2.indexOf('v');
		int s6=s2.lastIndexOf('e');
		System.out.println(s6);
		
		

	}

}
