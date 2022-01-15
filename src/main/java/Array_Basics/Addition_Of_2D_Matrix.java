package Array_Basics;

import java.util.Scanner;

public class Addition_Of_2D_Matrix {

	public static void main(String[] args) {
		
	    Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number of rows for  matrix");
		int iRow1=sobj.nextInt();
		
		System.out.println("Enter Number of cols for  matrix");
		int iCols1=sobj.nextInt();
		
		int[][] a=new int[iRow1][iCols1];
		
		System.out.println("Enter First Array Elements");
		for(int i=0;i<iRow1;i++)
		{
			for(int j=0;j<iCols1;j++)
			{
				a[i][j]=sobj.nextInt();
			}
		}
		
		
		System.out.println("-------------------------------------");
	
		
		int[][] b=new int[iRow1][iCols1];
				
		System.out.println("Enter Second array Elements");
		for(int i=0;i<iRow1;i++)
		{
			for(int j=0;j<iCols1;j++)
			{
				b[i][j]=sobj.nextInt();
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("Entered Elements is");
		for(int i=0;i<iRow1;i++)
		{
			for(int j=0;j<iCols1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		for(int i=0;i<iRow1;i++)
		{
			for(int j=0;j<iCols1;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		
		int[][] c=new int[iRow1][iCols1];
		
		System.out.println("Addition of a matrix is ");
		for(int i=0;i<iRow1;i++)
		{
			
			for(int j=0;j<iCols1;j++)
			{
				
					
				c[i][j]=a[i][j] - b[i][j];
					System.out.print( (c[i][j])+" ");
					c[i][j]=0;
			}
		
			System.out.println();
			
		}
		sobj.close();

	}

}


/*
 * Output of 2D Array
 
Enter Number of rows for  matrix
2
Enter Number of cols for  matrix
2
Enter First Array Elements
100
90
80
70
-------------------------------------
Enter Second array Elements
50
40
30
20
-------------------------------------
Entered Elements is
100 90 
80 70 
---------------------
50 40 
30 20 
-------------------------------------
Addition of a matrix is 
50 50 
50 50 
*/
