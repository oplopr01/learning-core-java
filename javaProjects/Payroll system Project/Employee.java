package PayrollSystem;


// following java BEAN structure to implement encapsulation in best manner

abstract class Employee {
	//private member variables
	private String name;
	private int id;
	
	// constructor to initialize variables
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;	
	}
	
	// getter methods to get the private data
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	
	// abstract method to apply body as per the situation
	public abstract double calculateSalary();
	
	@Override
	public String toString() {
		return "Employee [name = " + name + ", id = " + id +" ,salary = "+ calculateSalary()+"]";
	}
	
}
