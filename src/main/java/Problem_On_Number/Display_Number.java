package Problem_On_Number;

import java.util.Scanner;

class Display
{
	void Display_number(int iValue1,int iValue2)
	{
		if(iValue2<=0)
		{
			iValue2=-iValue2;
		}
		for(int i=1;i<=iValue2;i++)
		{
			System.out.print(iValue1+" ");
		}
	}
	
}

public class Display_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int iValue1=sobj.nextInt();
		
		System.out.println("Enter Second Number");
		int iValue2=sobj.nextInt();
		
		Display dobj=new Display();
		dobj.Display_number(iValue1,iValue2);
		
		

	}

}
