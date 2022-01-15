package visionit;

import java.util.LinkedList;

public class LinkedList_Demo1 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add("Vasant");//Insertion order maintain
		l.add(100);//Allowed heterogeneous data
		l.add(null);//Null insertion allowed
		l.add("Vasant");//Duplicate elements allowed 
		
		
		System.out.println(l);
		
		
		l.add(2, "Raman");//Insertion at middle allowed
		
		System.out.println(l);
		
		l.add("Ravi");//Insertion order must be maintain
		
		System.out.println(l);
		l.set(3, "Ankita");//Update null value
		
		System.out.println(l);
		
		l.set(3, "Pooja");//update at position of 3rd index
		System.out.println(l);
		
		l.remove(3);//Removing elements at position 3
		System.out.println(l);
	
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		System.out.println(l.removeFirst());
		
		System.out.println(l);
		
		l.addFirst("Pooja");
		l.addLast("Shelake");
		
		System.out.println(l);
		
		
	
	

	}

}
