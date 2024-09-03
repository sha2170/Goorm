package Mission02;

public class mission2_EmployeeManagerMain_0826 {

	public static void main(String[] args) {
		mission2_Employee_0826 employee = new mission2_Employee_0826("김철수", 500000, "사원");
		
		mission2_Manager_0826 manager = new mission2_Manager_0826("홍길동", 7000000, "팀장", 5);
		
		System.out.println("직원 정보 (급여 인상 전): ");
		employee.showEmployeeInfo();
		System.out.println();
		
		System.out.println("관리자 정보 (급여 인상 전): ");
		manager.showManagerInfo();
		System.out.println();
		
		employee.raiseSalary(10);
		manager.raiseSalary(10);
		
		System.out.println("직원 정보 (급여 인상 후): ");
		employee.showEmployeeInfo();
		System.out.println();
		
		System.out.println("관리자 정보 (급여 인상 후): ");
		manager.showManagerInfo();
		
	}

}
