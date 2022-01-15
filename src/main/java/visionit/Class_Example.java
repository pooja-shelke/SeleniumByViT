package visionit;

public class Class_Example {

	//Variable
	String title="Welcome to Amazon";
	String url="https://www.amazon.in";
	String header="Amazon.in: mobile";
	String Logo="https://www.amazon.in/ref=nav_logo";
	
	//Non-static method
	
	public void topPannel()
	{
		//Logic
		System.out.println("-------------Top Pannel Start---------");
		System.out.println(url);
		System.out.println(title);
		System.out.println(Logo);		
		System.out.println("-------------Top Pannel End------------");
		System.out.println();
	}
	
	public void centrePannel()
	{
		//Logic
		System.out.println("-------------Centre Pannel Start-----------");
		System.out.println("Mobile");
		System.out.println("Laptop");
		System.out.println("Books");
		System.out.println("Kitchen");
		System.out.println("-------------Centre Pannel End-------------");
		System.out.println();
	}
	
	public void footerLinks()
	{
		//Logic
		System.out.println("-------------footerLinks  Start--------");
		System.out.println("Links --1");
		System.out.println("Links --2");
		System.out.println("Links --3");
		System.out.println("-------------footerLinks End----------");
		System.out.println();
	}
	
	public static void helpSection()
	{
		//Logic
		System.out.println("-------------helpSection  Start----------");
		System.out.println("About the Application");
		System.out.println("Location");
		System.out.println("privacy policy");
		System.out.println("-------------helpSection  End------------");
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Class_Example obj=new Class_Example();
		obj.topPannel();
		obj.centrePannel();
		obj.footerLinks();
		
		Class_Example obj1=new Class_Example();
		obj1.topPannel();
		obj1.centrePannel();
		obj1.footerLinks();
		
	    helpSection();
	
		
		

	}

}
