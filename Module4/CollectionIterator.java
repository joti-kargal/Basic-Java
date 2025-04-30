package Module4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//WAP to iterate a Collection using Iterator 
public class CollectionIterator {

	public static void main(String[] args)
	{

		Collection<Integer>  c1=new ArrayList<Integer>();
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		System.out.println(c1); 
		Iterator<Integer> c3= c1.iterator();
		System.out.println("Iteration using Iterator");
		while (c3.hasNext())//Return Type boolean
		{
			System.out.println(c3.next());//Return type Object
		}

	}

}
