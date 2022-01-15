package Session15;

public class _1_Employeee {
	
	//Class Variable
	
	String name;
	int age;
	String dept;
	int empId;
	static String compName="Unicorn Systems";

	public static void main(String args[])
	{
		_1_Employeee obj1=new _1_Employeee();
		obj1.name="Tom";
		obj1.age=25;
		obj1.dept="QA";
		obj1.empId=101;
		
		_1_Employeee obj2=new _1_Employeee();
		obj2.name="Jons";
		obj2.age=30;
		obj2.dept="QE";
		obj2.empId=201;
		
		System.out.println("Employee 1 Info");
		
		System.out.println("Name "+obj1.name+" Age "+obj1.age+" Department "+obj1.dept+" Employee Id "+obj1.empId);
		
		System.out.println("Employee 2 Info");
		System.out.println("Name "+obj2.name+" Age "+obj2.age+" Department "+obj2.dept+" Employee Id "+obj2.empId);

	}
}
