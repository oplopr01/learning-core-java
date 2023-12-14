package PayrollSystem;

<<<<<<< HEAD


//this class containing states and behaviours which will be present in part time employees
=======
>>>>>>> 095a1b316437ab5fffa62482213b0c038b00a17d
public class PartTimeEmployee extends Employee{
	
	private int hoursWorked;
	private double hourlyRate;
	
	
	public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
		super(name, id);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
	
	
}
