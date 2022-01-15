package PreInsta_Programs;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Year");
		int year=sobj.nextInt();
		
		Chk_Leap_Year(year);
		

	}

	private static void Chk_Leap_Year(int year) {
		// TODO Auto-generated method stub
		
		boolean b=false;
		 
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			b=true;
		}
		
		if(b==true)
		{
			System.out.println("Year is  leap");
			
		}
		else
		{
			System.out.println("Year is not leap");
		}
	}

}
