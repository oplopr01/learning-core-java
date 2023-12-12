package PayrollSystem;

import java.util.ArrayList;

public class PayrollSystem {
	
	// using arrayList of Employee type to store many emp objects
	private ArrayList<Employee> employeeList;
	
	public PayrollSystem () {
		// assigning emp details in empList arrayList variable
		employeeList = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	// to remove a targeted employee
	public void removeEmployee(int id) {
		Employee employeeToRemove = null;
		for(Employee employee: employeeList) {
			if(employee.getId()==id) {
				employeeToRemove = employee;
				break;
			}
		}
		if(employeeToRemove != null) {
			employeeList.remove(employeeToRemove); 
		}
	}
	
	
	// to see employee details
	public void displayEmployee() {
		for(Employee employee: employeeList) {
			System.out.println(employee);
		}
	}
}
