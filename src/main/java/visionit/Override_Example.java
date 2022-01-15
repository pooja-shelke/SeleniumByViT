package visionit;

class Parent
{
	public void fun()
	{
		System.out.println("Parent");
	}
	
}

class Child extends Parent
{
	public void fun()
	{
		System.out.println("Child");
	}
	
}

class Override_Example
{
	public static void main(String args[])
	{
		Parent obj=new Child();
		obj.fun();
	}
	
}