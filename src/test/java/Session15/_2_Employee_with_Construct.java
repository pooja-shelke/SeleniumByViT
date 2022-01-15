package Session15;

public class _2_Employee_with_Construct {

	String name;
	int age;
	String dept;
	int empId;
	static String compName="Unicorn Systems";
	
	public _2_Employee_with_Construct() {
		System.out.println("Inside Zero parameter");
	}
	
	public _2_Employee_with_Construct(int i)
	{
		System.out.println("Inside One parameter :"+i);
	}
	
	public _2_Employee_with_Construct(String s)
	{
		System.out.println("Inside One parameter :"+s);
	}
	
	//Create a  constructor with all employee var initialize
	
	public _2_Employee_with_Construct(String name1,int age1,String dept1,int empId1)
	{
		System.out.println("constructor with all employee var initialize");
		name=name1;
		age=age1;
		dept=dept1;
		empId=empId1;
	}
	
	//Initialize 2 variable
	
	public _2_Employee_with_Construct(String name1,int empId1) {
		
		System.out.println("Inside Initialize 2 variable");
		name=name1;
		empId=empId1;
		
	}	
	
	
	public static void main(String[] args) {
	
		System.out.println("-------------------------------------------------");
		_2_Employee_with_Construct obj0=new _2_Employee_with_Construct();
		System.out.println("-------------------------------------------------");
		_2_Employee_with_Construct obj1=new _2_Employee_with_Construct(25);
		_2_Employee_with_Construct obj2=new _2_Employee_with_Construct("Thomas");
		System.out.println("-------------------------------------------------");
		_2_Employee_with_Construct obj3=new _2_Employee_with_Construct("Tom",30,"QA",101);
		_2_Employee_with_Construct obj4=new _2_Employee_with_Construct("John",30,"QE",201);
		_2_Employee_with_Construct obj5=new _2_Employee_with_Construct("Steve",45,"HR",301);

		
		System.out.println("-------------------------------------------------");
        System.out.println(obj3.name+" "+obj3.age+" "+obj3.dept+" "+obj3.empId+" "+compName);
        System.out.println(obj4.name+" "+obj4.age+" "+obj4.dept+" "+obj4.empId+" "+compName);
        System.out.println(obj5.name+" "+obj5.age+" "+obj5.dept+" "+obj5.empId+" "+compName);

        System.out.println("-------------------------------------------------");
		_2_Employee_with_Construct obj6=new _2_Employee_with_Construct("QE",201);
        System.out.println("For newly join employee"+obj6.name+" "+obj6.empId+" "+compName);

	}

}
