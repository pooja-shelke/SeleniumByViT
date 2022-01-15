package visionit;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {

	public static void main(String[] args)
	{
		//Craete HashSet With defalut capacity is 16
		HashSet hs=new HashSet();
		
		//Adding elements into HashSet
		hs.add("Pooja");
		hs.add("Shelake");
		hs.add(100);//Heterogeneus are allowed
		hs.add(null);//Null pointer exception are allowed
		
		boolean status=hs.add("Pooja");//duplicates are not allowed,if elements are already present then it returns boolean.
		System.out.println(status);
		
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		
		Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
			Object obj=it.next();
			
			System.out.println(obj);
			
			
		}

		
		
		

	}

}
