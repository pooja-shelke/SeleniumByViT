package visionit;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo2 {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=	new ArrayList<Integer>();
		
		al.add(100);
		al.add(20);
		al.add(30);
		al.add(5);
		al.add(45);
		al.add(15);
		
		Collections.sort(al);//
		System.out.println(al);
	
		
		System.out.println(al);
	}

}
