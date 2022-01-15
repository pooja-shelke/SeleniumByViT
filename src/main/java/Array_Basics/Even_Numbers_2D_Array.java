package Array_Basics;

import java.util.Scanner;

public class Even_Numbers_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number of rows");
		int iRows=sobj.nextInt();
		
	
		int[][] arr=new int[iRows][];
		arr[0]=new int[2];
		arr[1]=new int[4];
//		arr[2]=new int[4];
//		arr[3]=new int[4];
//		arr[4]=new int[4];
		
		
		System.out.println("Enter Elements");
		
		for(int i=0;i<iRows;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}
		

		System.out.println("Your Entered Elements");
		
		for(int i=0;i<iRows;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		

		
		for(int i=0;i<iRows;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]%2==0)
				{
					System.out.print(arr[i][j]+" ");
				}
				
			}
			System.out.println();
		}

	}

}
