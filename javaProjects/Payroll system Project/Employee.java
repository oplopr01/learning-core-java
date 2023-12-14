package PayrollSystem;


// following java BEAN structure to implement encapsulation in best manner

abstract class Employee {
	//private member variables
	private String name;
	private int id;
	
<<<<<<< HEAD
	// constructor to initialize variables
=======
	
>>>>>>> 095a1b316437ab5fffa62482213b0c038b00a17d
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;	
	}
	
<<<<<<< HEAD
	// getter methods to get the private data
=======
>>>>>>> 095a1b316437ab5fffa62482213b0c038b00a17d
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
<<<<<<< HEAD
	
	// abstract method to apply body as per the situation
=======
>>>>>>> 095a1b316437ab5fffa62482213b0c038b00a17d
	public abstract double calculateSalary();
	
	@Override
	public String toString() {
		return "Employee [name = " + name + ", id = " + id +" ,salary = "+ calculateSalary()+"]";
	}
	
}
