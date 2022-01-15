package visionit;

import java.awt.List;
import java.util.HashSet;

public class DemoHashSet1 {

	public static void main(String[] args) {
		
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Vasant");
		hs.add("Vaishali");
		hs.add("Ankita");
		hs.add("Pooja");
		
		System.out.println(hs);
		
		hs.remove("Pooja");
		System.out.println(hs);
		
	
		
		
	}

}
