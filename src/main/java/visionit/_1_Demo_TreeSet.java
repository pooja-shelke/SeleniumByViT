package visionit;

import java.util.TreeSet;

public class _1_Demo_TreeSet {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		
		t.add("B");
		t.add("A");
		t.add("C");
		t.add("A");
		//t.add(100);//Heterogeneous elements are not allowed
		//t.add(null);//Null Pointer exception are not allowed
		//Insertion order are not preserve but they insert in default insertion order
		
		boolean status=t.add("A");
		System.out.println(status);
		System.out.println(t);
		System.out.println(t.size());


	}

}
