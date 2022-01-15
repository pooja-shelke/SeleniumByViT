package Problem_On_Number;

import java.util.*;

class Factor_Multiplication
{
	int Multiplication(int iValue)
	{
		int iMult=1;
		for(int i=1;i<iValue;i++)
		{
			if((iValue%i)==0)
			{
				iMult=iMult*i;
			}
		}
		return iMult;
	}

	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int iNo=sobj.nextInt();
		
		Factor_Multiplication obj=new Factor_Multiplication();
		
		int Ret=obj.Multiplication(iNo);
		
		System.out.println(Ret);
		
	}
}