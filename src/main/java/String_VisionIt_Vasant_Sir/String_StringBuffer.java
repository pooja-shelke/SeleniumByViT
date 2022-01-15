package String_VisionIt_Vasant_Sir;

public class String_StringBuffer {
	
	
	
	//Override 
	//toString() is method of Object Class
	//If we Override Object Class Then method of child class gets called
	//So it will return actual content of the child class methods
	
	public String toString()
	{
		return "Hello";
	}

	public static void main(String[] args) 
	{
		String_StringBuffer sobj=new String_StringBuffer();
		
		System.out.println(sobj.toString());//if this method is not present in child child then
		//It will returns hashCode bcoz it will call object class method
		
		String s="Vasant";
		
		StringBuffer sb=new StringBuffer(s);
		
		sb.reverse();
		
		System.out.println(sb);//
		
		String sobj1=sb.toString();
		System.out.println(sobj1);

		
	}

}
