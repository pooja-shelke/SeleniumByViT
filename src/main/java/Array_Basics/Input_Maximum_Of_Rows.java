package Array_Basics;

import java.util.Scanner;

public class Input_Maximum_Of_Rows {
	
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number of Rows");
		int iRows=sobj.nextInt();
		
		System.out.println("Enter Number of Columns");
		int iCols=sobj.nextInt();
		
		 int arr[][]=new int[iRows][iCols];
		 
		 System.out.println("Please Accept input For array ");
		 for(int i=0;i<iRows;i++)
		 {
			 for(int j=0;j<iCols;j++)
			 {
				 arr[i][j]=sobj.nextInt();
			 }
		 }
		 
		 System.out.println("You Entered data is");
		 for(int i=0;i<iRows;i++)
		 {
			 for(int j=0;j<iCols;j++)
			 {
				 System.out.print("|"+arr[i][j]);
			 }
			 System.out.println(); 
		 }
		 
		 for(int i=0;i<iRows;i++)
		 {
			 int iSum=0;
			 
			 for(int j=0;j<iCols;j++)
			 {
				 iSum=iSum+arr[i][j];
				 
			 }
			 System.out.println(iSum);
		 }
		
	}
}
