package PayrollSystem;

public class Main {

	public static void main(String[] args) {
		
		PayrollSystem payrollSystem = new PayrollSystem();
		FullTimeEmployee femp1 = new FullTimeEmployee("emp1", 101, 20000);
		PartTimeEmployee pemp1 = new PartTimeEmployee("pemp1", 201,5, 30000);

		
		payrollSystem.addEmployee(femp1);
		payrollSystem.addEmployee(pemp1);
		
		
		
		
		
	}

}
