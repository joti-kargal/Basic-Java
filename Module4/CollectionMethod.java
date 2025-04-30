package Module4;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {

	public static void main(String[] args)
	{
		List l1=new ArrayList();
		l1.add("Moon");
		l1.add(24);
		l1.add("Earth");
		l1.add(1.45);
		l1.add(345);
		l1.add(1, "Sun");
		System.out.println(l1);
		
		List l2=new ArrayList();
		l2.add(45);
		l2.addAll(l1);
		System.out.println(l2);

	}

}
