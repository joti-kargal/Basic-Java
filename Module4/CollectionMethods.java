package Module4;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

	public static void main(String[] args)
	{
		Collection<Integer>  c1=new ArrayList<Integer>();
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		System.out.println(c1);   //Add
		
		Collection<Integer> c2=new ArrayList<Integer>();
		c2.add(30);
		c2.add(56);
		c2.add(34);
		c2.add(65);
		System.out.println(c2);
		c2.addAll(c1);
		System.out.println(c2); //addall
		boolean b1=c2.contains(20);//Contains
		System.out.println(b1);
		boolean b2=c2.containsAll(c1);//containsAll
		System.out.println(b2);
		c2.remove(30);//remove
		System.out.println(c2);
		
		
		
		
	}

}
