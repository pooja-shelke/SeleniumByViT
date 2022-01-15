package Array_Basics;

import java.util.Scanner;

public class _1_2D_Example {

	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter iRow");
		int iRow=sobj.nextInt();
		
		System.out.println("Enter iCols");
		int iCols=sobj.nextInt();
		
		int[][] numbers=new int[iRow][iCols];
		
		System.out.println("Enter Elements inti the array");
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCols;j++)
			{
				numbers[i][j]=sobj.nextInt();
			}
		}
		
		
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCols;j++)
			{
				System.out.print("|"+numbers[i][j]);
			}
			System.out.println("|");
		}
		for(int j=0;j<iCols;j++)
		{
			int iSum=0;
		
		for(int i=0;i<iRow;i++)
		{
			
				iSum=iSum+numbers[i][j];
		}		
			
			System.out.println(iSum);
		
		}

	}

}
