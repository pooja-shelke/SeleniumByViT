package Session14;

public class Login_Application {

	//Overloading
	//Login-
	//1.Already Stored
	//2.Username
	//3.PhoneNum pass
	//4.username and phonenum
	//opt/pass
	
	
	/*
	 Rule 
	 1.Create methods in same class
	 2.Type of parameter should be different
	 3.Sequence of parameter should be unique
	 4.Static method also  get overloaded
	 */
	
	
	public void Login()
	{
		System.out.println("Login with Already Stored credential");
	}
	
	public void Login(String Uname)
	{
		
		System.out.println("Login with UserName is :"+Uname);
	}
	
	public void Login(int OTP)
	{
		
		System.out.println("Login with OTP is :"+OTP);
	}
	

	public void Login(String Uname,String Password)
	{
		
		System.out.println("Login with UserName :"+Uname+"and Password is :"+Password);
	}
	
	public void Login(int PhoneNum,String Password)
	{
		
		System.out.println("Login with OTP is :"+PhoneNum);
	}
	
	public void Login(String UserName,int PhoneNum)
	{
		
		System.out.println("Login with UserName :"+UserName+"and PhoneNumber is :"+PhoneNum);
	}

	
	public static void main(String[] args) {
		
		
		
	}

}
