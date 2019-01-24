package Employee.EmployeeEx;

public abstract class Person {
	
	private int id;
	private String name;
	
	
	public Person(int id, String name )
	{
		this.id = id;
		this.name = name;
		
	}
	
	public String ToString(String name)
	{
		return "name = "+this.name;
	}
	
	public String changeName(String newname)
	{
		return this.name = newname;
	}
	public abstract int salary();
	
	

}
