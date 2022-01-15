package visionit;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		
		Vector v=new Vector();   
		
		System.out.println(v.size());//size is depends on inserting elements into vector so it will give 0 size
		
		System.out.println(v.capacity());//Default capacity of the vector is 10
		
		v.add("Vasant");
		v.add(101);
		v.add(null);
		v.add("Vasant");
		v.add(20);
		
		System.out.println(v);
		System.out.println(v.size());//5
		
		v.add("Vasant");
		v.add(101);
		v.add(null);
		v.add("Vasant");
		v.add(20);
		//------------------------------
		//Capacity is 10 after 11th elements add into vector object capacity of the vector will increased by 10
		v.add("Ankita");
		System.out.println(v.capacity());
		System.out.println(v);
		
//		v.remove(1);
//		System.out.println(v);
//		
//		v.remove("Vasant");
//		System.out.println(v);
		
		v.add(4,"Vaishali");
		System.out.println(v);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		v.add("Testing");
		
		System.out.println(v);

	}

}
