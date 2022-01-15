package visionit;

public class Methods_In_Java {
	
    //No Input No return
	public void test()
	{
		System.out.println("Inside Test");
	}
	
	//No Input Some return
	public String nameOfCountry()
	{
		String countryName="India";
		
		return countryName;
	}

	//
	public String[] listOfSudents()
	{
		System.out.println("Students List - ");
		
		String[] names=new String[3];
		
		names[0]="person1";
		names[1]="person2";
		names[2]="person3";
		
		return names;
	}
//-----------------------------------------------------------	
	public String FactoryName(String NameofFactory)
	{
		if(NameofFactory.equals("nike"))
		{
			String fact1="@@Nike@@";
			System.out.println("Hey this is Nike Factory");
			return fact1;
		}
		else if(NameofFactory.equals("pume"))
		{
			String fact2="@@pume@@";
			System.out.println("Hey this is Puma Factory");
			return fact2;
		}
		
		return "No Factory Found with Given Criteria";
	}
//------------------------------------------------------
	
	public String countryCapital(String NameofCountry)
	{
		if(NameofCountry.equalsIgnoreCase("India"))
		{
			return "New Delhi";
		}
		else if(NameofCountry.equals("USA"))
		{
			return "Washington DC";
		}
		
		return "No Country Found";
	}
	
	
//----------------------------------------------------------	
	
	public void addPrintonly(int a,int b)
	{
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	
	public int addPrintReturn(int a,int b)
	{
		int c=0;
		c=a+b;
		return c;
	}
/*
	public static void main(String[] args) 
	{
	Methods_In_Java methods_In_Java=new Methods_In_Java();
	
	methods_In_Java.test();
	
	System.out.println("------------------------------");
	String str=methods_In_Java.nameOfCountry();
	System.out.println(str);
	System.out.println("------------------------------");
	
	String[] ListStudent=methods_In_Java.listOfSudents();
	for(int i=0;i<ListStudent.length;i++)
	{
	System.out.println(ListStudent[i]);
	}
	System.out.println("------------------------------");
	
	String name=methods_In_Java.FactoryName("nike");
	System.out.println(name);
	System.out.println("------------------------------");
	
	String CapReturn=methods_In_Java.countryCapital("INDIA");
	System.out.println(CapReturn);
	System.out.println("------------------------------");
	
	methods_In_Java.addPrintonly(10,20);
	System.out.println("------------------------------");
	int iRet=methods_In_Java.addPrintReturn(100,20);
	
	System.out.println(iRet);
	
	System.out.println("------------------------------");
	methods_In_Java.addPrintonly(iRet,5);
	
}
*/
	
}
