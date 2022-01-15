package Problem_On_Number;

import java.util.Scanner;

class Demo
{
	int Dividi_By_Two(int iValue1,int iValue2)
	{
		int iRet=0;
		if((iValue1>0)&&(iValue2>0))
		{
			iRet=iValue1/iValue2;
			
		}
		else
		{
			System.out.println("Please enter number greater than Zero");
		}
		return iRet;
	}
}

public class Divide_Two_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers for Division");
		int iValue1=sobj.nextInt();
		int iValue2=sobj.nextInt();
		
		Demo obj=new Demo();
		int iRet=obj.Dividi_By_Two(iValue1,iValue2);
		
		System.out.println("Your Division is :"+iRet);
		
		

	}

}
