package visionit;

class A
{
   public void A1()
   {
	   System.out.println("Inside A1");
   }
   
   public void A2() {
	   System.out.println("Inside A2");
   }
}

class B extends A
{
	public void B1() {
		  System.out.println("Inside B1");
	}
	
	public void B2() {
		  System.out.println("Inside B2");
	}
}


public class Inheritance_Example {
	
	public static void main(String args[]) {
		
		B obj=new B();
		obj.A1();
		obj.A2();
		obj.B1();
		obj.B2();
		
	}

}
