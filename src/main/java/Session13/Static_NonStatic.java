package Session13;

public class Static_NonStatic 
{
	String name;//non-static characteristics
	
	static int age=25;//static varibles
	
	public void getName()
	{
		System.out.println("get Name");
	}
	
	public static void getStart()
	{
		System.out.println("get Start");
	}
	
	public static void main(String args[])
	{
		//How to calling static method inside same class
		// way 1
		System.out.println("-----------------------------------");
		getStart();
		System.out.println(age);
		
		System.out.println("-----------------------------------");
		//way 2
		Static_NonStatic.getStart();
		System.out.println(Static_NonStatic.age);
		System.out.println("-----------------------------------");
		
		//way 3
		
		Static_NonStatic obj=new Static_NonStatic();
		obj.getStart();
		System.out.println(Static_NonStatic.age);
	
		System.out.println("-----------------------------------");
		
		//How to calling non-static method
		Static_NonStatic obj1=new Static_NonStatic();
		obj.getName();
		System.out.println(obj1.name);
		System.out.println("-----------------------------------");
		
		//Can we create object without creating reference variable
		new Static_NonStatic().getStart();
		
		Static_NonStatic obj2=new Static_NonStatic();
		obj2.getName();
		obj2=null;//if object initialize to null it will give null pointer exception
		//we cannot execute other code 
		obj2.getName();
		
		
		
	}
	

}
