package visionit;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class _1_Demo_LinkedHashSet {

	public static void main(String[] args) {
	
		LinkedHashSet lsh=new LinkedHashSet();
		
		lsh.add("Pooja");//Insertion order preserve
		lsh.add("Shelake");
		lsh.add(100);//Heterogeneous are allowed
		lsh.add(null);//null pointer exception are allowed
		lsh.add("Pooja");//Duplicates are allowed
		
		boolean status=lsh.add("Pooja");
		
		System.out.println(status);
		
		lsh.remove("Pooja");
		
		List<Object> l=new ArrayList<Object>();//We add or remove elements from Collection also
		
		l.add(lsh.add("Pooja"));
		
		l.removeAll(lsh);
		System.out.println(lsh);
		
	}

}
