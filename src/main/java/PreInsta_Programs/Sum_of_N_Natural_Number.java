package PreInsta_Programs;

import java.util.Scanner;

public class Sum_of_N_Natural_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int Num=sobj.nextInt();
		
		int iSum=0;
		
		for(int i=1;i<=Num;i++)
		{
			iSum=iSum+i;
		}
		
		System.out.println("Sum of all natural number is:"+iSum);

	}

}
