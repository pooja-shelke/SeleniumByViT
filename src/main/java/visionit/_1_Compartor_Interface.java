package visionit;

import java.util.Comparator;
import java.util.TreeSet;




class MyCompartor implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		/*
		 * f(i1<i2)
		 *  {
		 *   return +1; 
		 *   } 
		 *   else if(i1>i2) 
		 *   { 
		 *   return -1;
		 *   
		 *    }
		 *     else 
		 *     { 
		 *     return 0; 
		 *     }
		 */
		
		//return i1.compareTo(i2);//compareTo() method gives us Default natural sorting order.
		
		//If we want reverse of it then 
		
		//return i2.compareTo(i1);
		return -i1.compareTo(i2);
	}
}


public class _1_Compartor_Interface {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyCompartor());
		t.add(10);
		t.add(5);
		t.add(15);
		t.add(2);
		t.add(13);
		t.add(4);
		t.add(20);
		
		System.out.println(t);

	}

}