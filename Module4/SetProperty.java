package Module4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty {

	public static void main(String[] args) {
		Set s1=new HashSet();
        s1.add(25);
        s1.add("Moon");//only one Null we can add
        s1.add(45);
        s1.add("Sun");
        s1.add("null"); 
        System.out.println(s1);
        
        Iterator i2=s1.iterator();
	}

}
