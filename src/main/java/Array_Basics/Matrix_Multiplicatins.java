package Array_Basics;

import java.util.Scanner;

public class Matrix_Multiplicatins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number of rows for First matrix");
		int iRow1=sobj.nextInt();
		
		System.out.println("Enter Number of cols for First matrix");
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
		
		System.out.println("Enter Number of rows for Second matrix");
		int iRow2=sobj.nextInt();
		
		System.out.println("Enter Number of cols for Second matrix");
		int iCols2=sobj.nextInt();
		
		
		int[][] b=new int[iRow2][iCols2];
				
		System.out.println("Enter Second array Elements");
		for(int i=0;i<iRow2;i++)
		{
			for(int j=0;j<iCols2;j++)
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
		for(int i=0;i<iRow2;i++)
		{
			for(int j=0;j<iCols2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		System.out.println("Enter Number of rows for output matrix");
		int iRow3=sobj.nextInt();
		
		System.out.println("Enter Number of cols for output matrix");
		int iCols3=sobj.nextInt();
		
		int[][] c=new int[iRow3][iCols3];
		
		System.out.println("Multiplicaion of matrix is");
		int iSum=0;
		
		
		for(int i=0;i<iRow3;i++)
		{
			for(int j=0;j<iCols3;j++)
			{
				for(int k=0;k<3;k++)
				{
					
					iSum=iSum+a[i][k]*b[k][j];
				}
				c[i][j]=iSum;
				iSum=0;
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
