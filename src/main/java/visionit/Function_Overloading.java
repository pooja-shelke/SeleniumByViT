package visionit;

class Overload_Funcyion
{
	int inum1=0;
	int inum2=0;
	int inum3=0;

	
	public Overload_Funcyion(int x,int y)
	{
		inum1=x;
		inum2=y;
	}
	
	public Overload_Funcyion(int x,int y,int z)
	{
		inum1=x;
		inum2=y;
		inum3=z;
	}
	public void Add(int inum1,int inum2)
	{
		System.out.println(inum1+inum2);
		
	}
	
	public void Add(int inum1,int inum2,int inum3)
	{
		System.out.println(inum1+inum2+inum3);
	}
	
	
}




public class Function_Overloading {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload_Funcyion obj=	new Overload_Funcyion(0,0);
		obj.Add(10,20);
		
		Overload_Funcyion obj1=	new Overload_Funcyion(0,0,0);
		obj1.Add(10,20,30);
		
	//	new Overload_Funcyion(10,20,30); 
		

	}

}
