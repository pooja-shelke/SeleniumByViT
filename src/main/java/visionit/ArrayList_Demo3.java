package visionit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList_Demo3 {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		
		al.add("PPA");
		al.add("LB");
		al.add(100);
		al.add(true);
		al.add(null);
		
		System.out.println(al);
		
		List l=new ArrayList();
		
		l.add("Piyush sir");
		l.add(120000);
		
		al.addAll(l);//Add elements into al at the end of ArrayList
		
		System.out.println(l);
		System.out.println(al);
		
		al.addAll(2, l);//Add elements after 2 index
		System.out.println(al);
		
		al.remove(3);//To remove specific element from ArrayList
		System.out.println(al);
		
		al.removeAll(l);
		System.out.println(al);
		
		al.clear();
		
		System.out.println(al);

		
		
	}

}
