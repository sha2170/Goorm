package Mission02;

public class mission2_Employee_0826 {
	private String name;
	private double salary;
	private String position;
	
	public mission2_Employee_0826(String name, double salary, String position) {
		this.name = name;
		this.salary = salary;
		this.position = position;
	}
	
	public void raiseSalary(double percent) {
		salary += salary * percent / 100;
	}
	
	public void showEmployeeInfo() {
		System.out.println("이름: " + name);
		System.out.println("연봉: " + salary);
		System.out.println("직급: " + position);
	}
	
}

