package Session16;

import java.lang.*;
import java.util.*;

class _3_TestCar
{
	void PrintEvn(int iNo)
	{
		for(int i=1;i<=iNo;i++)
		{
		   if(iNo%i==0)
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
	
	_3_TestCar hobj=new _3_TestCar();
	
	hobj.PrintEvn(iNo);
}
	

}
