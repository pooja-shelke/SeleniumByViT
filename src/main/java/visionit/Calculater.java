package visionit;

public class Calculater
{
	int iNo1=20;//non static variable
	int iNo2=10;
	
	public void Addition() // non-static method
	{
		int iAdd=0;
		iAdd=iNo1+iNo2;
		System.out.println("Addiiton is :"+iAdd);	
	}
	

	public void Substraction()
	{
		int iSub=0;
		iSub=iNo1-iNo2; 
		System.out.println("Substraction is :"+iSub);	
	}
	
	public void Multiplication()
	{
		int iMult=0;
		iMult=iNo1*iNo2;
		System.out.println("Multiplication is :"+iMult);	
	}
	
	public void Division()
	{
		int iDiv=0;
		iDiv=iNo1/iNo2;
		System.out.println("Division is :"+iDiv);	
	}
	
	public static void Modular() //static mathod
	{
		System.out.println("Inside Modular");
	}
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		Calculater cobj=new Calculater();
		cobj.Addition();
		cobj.Substraction();
		cobj.Multiplication();
		cobj.Division();
		
		Modular();//Calling static method using only method name itself.
		
		System.out.println("Value of iNo1 is :"+cobj.iNo1);
		System.out.println("Value of iNo2 is :"+cobj.iNo2);
		
		

	}
}
