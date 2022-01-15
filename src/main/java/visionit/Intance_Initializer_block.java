package visionit;

class Instance_Demo
{
	
	public Instance_Demo(){
		System.out.println("Inside constructor");
		
	}
	{
		System.out.println("Inside Intance block");
		
	}
	
}

public class Intance_Initializer_block {
	public static void main(String args[])
	{
		System.out.println("Inside Main Method");
		Instance_Demo obj=new Instance_Demo();
	}

}
