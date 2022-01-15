package Problem_On_Number;

import java.util.*;

class PrintEvenNumber
{
	void PrintEvn(int iNo)
	{
		for(int i=1;i<=iNo;i++)
		{
		   if((iNo%i==0)&&(i%2)==0)
		   {
			   System.out.println(i+"\t");
		   }			   
		}
	}

public static void main(String args[])
{
	Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter Number:");
	int iNo=sobj.nextInt();
	
	PrintEvenNumber hobj=new PrintEvenNumber();
	
	hobj.PrintEvn(iNo);
}
	
}
