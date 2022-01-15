/*Write a program to diplay reverse factor
input 12
output 6	4	3	2	1 */


package Problem_On_Number;

import java.util.*;

class FactRev
{
	void FactorReverse(int iValue)
	{
		int iMult=1;
		for(int i=iValue/2;i>=1;i--)
		{
			if((iValue%i)==0)
			{
				System.out.print(i+"\t");
			}
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int iNo=sobj.nextInt();
		
		FactRev obj=new FactRev();
		
		obj.FactorReverse(iNo);
		
		sobj.close();	
	}
}