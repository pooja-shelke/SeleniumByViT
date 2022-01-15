package Problem_On_Number;

import java.util.Scanner;

public class Display_Evn_Count {
	
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int iNum=sobj.nextInt();
		
		int iRet=EvnCount(iNum);
		
		System.out.println("Counter of Even Number is :"+iRet);
	}

	private static int EvnCount(int iNum) {
		// TODO Auto-generated method stub
		
		int iDigit=0;
		int iCnt=0;
		while(iNum!=0)
		{
			iDigit=iNum%10;
			
			if(iDigit%2==0)
			{
				iCnt++;
			}
			iNum=iNum/10;
		}
	
		
		return iCnt;
	}
	
	
	

}
