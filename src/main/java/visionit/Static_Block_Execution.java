package visionit;
//
//class Static_Demo
//{
//	public int i;
//	public static int j;
//	
//	static 
//	{
//		j=10;
//		//System.out.println(i);We cannot access non-static characteristics inside block block
//	}
//	
//	
//	public void fun()
//	{
//		j=21;
//		//static int x=10;//We cannot declared static variable inside function
//		
//		System.out.println(j);
//		
//	}
//	
//	
//public static void gun()
//{
//	int x=10;
//	
//	//System.out.println(i);	//We cannot access non-static  variable
//	System.out.println("Inside gun");
//}
//	
//}


public class Static_Block_Execution {
	
	public static int j;
	
	
	public int x;
	
	
	static {
		 j=10;
		
		System.out.println("Inside static block");
	}
	
	public static void gun() {
		int v=90;
		
		j=30;
		
		
		
		System.out.println("Inside static function");
		System.out.println("Inside static function"+v);
	}
	
	
	public void fun() {
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		//Static_Block_Execution obj=new  Static_Block_Execution();
		// obj.fun();
		 
		 System.out.println(j);
		 //System.out.println();
		 Static_Block_Execution.gun();
		 

	}

}
