package visionit;

import java.util.Scanner;

public class InputToUserForMethods_In_Java {
	

	public static void main(String[] args) 
	{
		Methods_In_Java methods_In_Java=new Methods_In_Java();
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("Please Enter Number");
		int intFirst=sc.nextInt();
		int intSecond=sc.nextInt();
		//sc.close();//Close Scanner
		
		
		methods_In_Java.addPrintonly(intFirst,intSecond);
		*/
		System.out.println("Please Enter Country Name");
		String inputfomUser=sc.next();
		sc.close();
		
		
		String str=methods_In_Java.countryCapital(inputfomUser);
		System.out.println(str);

	}


}
