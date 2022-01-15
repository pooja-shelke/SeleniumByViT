package PreInsta_Programs;

import java.util.Scanner;

public class Sum_Of_Num_In_Given_Range {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Starting number");
		int iStart=sobj.nextInt();
		
		System.out.println("Enter Ending number");
		int iEnd=sobj.nextInt();
		
		int iSum=0;
		
		for(int i=iStart;i<=iEnd;i++)
		{
			iSum=iSum+i;
		
		}
		System.out.println(iSum);

	}

}
