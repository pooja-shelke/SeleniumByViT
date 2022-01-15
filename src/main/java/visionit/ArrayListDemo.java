package visionit;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static <E> void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Pooja");
		al.add("Shelake");
		al.add("Amir");
		al.add("Shaikh"); 
		al.add("Pooja");//Duplicates data are allowed in ArrayList
		al.add("Amir");
		al.add(null);//Null Insertion are allowed in ArrayList
		al.add(1, "Subhash");//If you want to insert data at index 1.
		al.set(7, "Samarth");//We can Update date at position of index 6. 
		
		
		//To Retrieve the data one by one
		//Using For Loop
		for(int i=0;i<al.size();i++)
		{		
			System.out.print(al.get(i)+" ");
        }
		
		System.out.println();
		//uSing Foreach loop
		 for(String al1:al)
		 {
			 System.out.print(al1+" ");
		 }
		 
		 System.out.println();
		
		 //Using Object of the ArrayList
		System.out.println(al);
		
		System.out.println("Size of ArrayList is: "+al.size());//How many data inserted into 
		      //your ArrayList we can find by using size() methods of ArrayList.
	
		System.out.println(al.isEmpty());//To Check ArrayList is Empty or Not.It return True or False
		
		System.out.println(al.indexOf("Pooja"));//First Occurrence of the Pooja is 0.
		System.out.println(al.lastIndexOf("Pooja"));//Last Occurrence of the Pooja is 5.
	
		Collections.sort(al);//Sorting ans serching operation we use Collections Class
		System.out.println(al);
		
	}

}
