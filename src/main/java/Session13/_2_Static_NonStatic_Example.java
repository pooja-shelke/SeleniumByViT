package Session13;

public class _2_Static_NonStatic_Example {

	String name;
	int price;
	String colour;
	
	static int wheels=4;//
	
	
	
	
	
	
	
	

	
	
	public static void main(String[] args) 
	{
		_2_Static_NonStatic_Example obj=new _2_Static_NonStatic_Example();
		obj.name="BMW";//We can Initial class characteristics as well
		obj.price=5_00_000;
		obj.colour="Sterning Block";
		//obj.wheels=5;
		
		System.out.println("--------------------------------------");
		System.out.println("Details Printing");
		System.out.println(obj.name);
		System.out.println(obj.price);
		System.out.println(obj.colour);
		System.out.println(wheels);
		System.out.println("--	------------------------------------");
		
		
		//
	
		_2_Static_NonStatic_Example obj1=new _2_Static_NonStatic_Example();
		obj1.name="WagonR";
		obj1.price=6_000;
		obj1.colour="White";
		wheels=6;
		System.out.println("--------------------------------------");
		System.out.println("Details Printing");
		System.out.println(obj1.name);
		System.out.println(obj1.price);
		System.out.println(obj1.colour);
		System.out.println(wheels);
		System.out.println("--------------------------------------");
	
	}

}
