package PayrollSystem;

<<<<<<< HEAD

// this class containing states and behaviours which will be present in fulltine employees

public class FullTimeEmployee extends Employee {
	private double monthlySalary;
	
	
	
	public FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);  // super calling statment to run it's parent class constructor
=======
public class FullTimeEmployee extends Employee {
	private double monthlySalary;
	
	public FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);
>>>>>>> 095a1b316437ab5fffa62482213b0c038b00a17d
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public double calculateSalary() {
		return monthlySalary;
	}

}
