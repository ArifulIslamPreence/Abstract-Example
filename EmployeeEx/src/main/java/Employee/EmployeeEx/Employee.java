package Employee.EmployeeEx;


public class Employee extends Person{

	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name,int salary) {
		super(id, name);
		this.salary = salary;		
	}
	@Override
	public int salary() {
		if(salary == 0)
		{
			System.out.print("no salary recorded\n");
		}
		else
		{
			System.out.print("salary = "+this.salary);;
		}
		return salary;
		
	}
	
	public static void main(String args[])
	{
		Person p = new Employee(111,"nobody",0);
		p.salary();
		Employee emp = new Employee(121,"Preence",1000);
		String namex = emp.changeName("Ariful");
		 System.out.print(" name =  "+namex+" ");
		 
		 emp.salary();
		 
		 
		
	}
	

}
