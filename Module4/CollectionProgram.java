package Module4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionProgram {

	public static void main(String[] args)
	{
		List<String> l1=new ArrayList<String>();
		l1.add("Moom");
		l1.add("Sun");
		l1.add("Rock");
		l1.add("Rock");
		l1.add("Null");
		System.out.println(l1);
	   Iterator<String> i2=l1.iterator();
		while(i2.hasNext());
		{
			System.out.println(i2.next());
		}
		ListIterator<String> i3=l1.listIterator();
		





	}

}
