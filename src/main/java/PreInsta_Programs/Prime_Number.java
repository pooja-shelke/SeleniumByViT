package PreInsta_Programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sobj=new Scanner(System.in);
		
		
		System.out.println("Enter Number To Check Number is Prime or not");
		int Num=sobj.nextInt();
		
		int iCnt=0;
		
		for(int i=1;i<=Num;i++)
		{
			if(i%1==0 && i%i==0)
			{
				iCnt++;
				System.out.println(i);
			}
			
		}
		

	}

}
