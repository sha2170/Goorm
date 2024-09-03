package Mission02;

public class mission2_Manager_0826 extends mission2_Employee_0826 {
	private int numberOfEmployees;
	
	public mission2_Manager_0826(String name, double salary, String position, int numberOfEmployees) {
		super(name, salary, position);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public void raiseSalary(double percent) {
		double bonusPercent = percent + 2.0;
		super.raiseSalary(bonusPercent);
	}
	
	public void showManagerInfo() {
		showEmployeeInfo();
		System.out.println("관리하는 직원 수: " + numberOfEmployees);
	}
	
}
