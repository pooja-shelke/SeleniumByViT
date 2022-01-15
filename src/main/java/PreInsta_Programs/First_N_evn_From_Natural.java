package PreInsta_Programs;

import java.util.Scanner;

public class First_N_evn_From_Natural {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int Num=sobj.nextInt();
		
		
		for(int i=1;i<=Num;i++)
		{
			if(i%2==0)
			{
				System.out.print(i +" ");
			}
		}
		
		System.out.println();
		int iSum=0;
		
		for(int i=1;i<=Num;i++)
		{
			if(i%2==0)
			{
				 iSum=iSum+i;
			}
		}
		System.out.println("Sum of a even natural number is "+iSum);

	}

}
