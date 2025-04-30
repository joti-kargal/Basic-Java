package Module3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setProperties {

	public static void main(String[] args)
	{
		Set s1=new HashSet();
		s1.add(12);
		s1.add(12.2);
		s1.add("Moon");
		s1.add("Earth");
		s1.add("Rock");
		System.out.println(s1);
		Iterator i=s1.iterator();
		
	}

}
