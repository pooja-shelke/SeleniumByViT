package Session14;

public class _2_Login_Application {
	
	public void Search(String ProductName)
	{
		
		System.out.println("Serach By ProductName is "+ProductName);
	}
	
	public void Search(String ProductName,int Price)
	{
		System.out.println("Serach By ProductName is "+ProductName+" and Price is : "+Price);
	}
	
	public void Search(String ProductName,int Price,String SellerName)
	{
		System.out.println("Serach By ProductName is "+ProductName+" and Price is : "+Price+" and Seller Nmae is :"+SellerName);
	}
	
	public void Payment(long CCNumber)
	{
		System.out.println("Payment By CCNUMber is :"+CCNumber);
	}
	

	public void Payment(long CCNumber,int Pin)
	{
		System.out.println("Payment By CCNUMber is with Pin :"+CCNumber+Pin);
	}
	
	

	public void Payment(long CCNumber,int Pin,String CCHolderName)
	{
		System.out.println("Payment By CCNUMber is  :"+CCNumber+" with Pin  "+Pin+" and CCHolderName "+CCHolderName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		_2_Login_Application Login_Application=new _2_Login_Application();
		Login_Application.Search("T-Shirt");
		Login_Application.Search("Wallet",800);
		Login_Application.Search("Bottle",500,"Unicorn Enterprices");
		
		System.out.println("--------------------------------------------------------");
		Login_Application.Payment(9808);
		Login_Application.Payment(90890, 414);
		Login_Application.Payment(90989, 414, "Pooja Shelake");
	}
	

}
