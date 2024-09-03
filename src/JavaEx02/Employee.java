package JavaEx02;

public class Employee {
    // 멤버 필드
    private String empNo;
    private String empName;
    private String empDpt;

    // 필드 값 저장 메서드
    public void setEmployee(String empNo, String empName, String empDpt) {
        this.empNo = empNo;
        this.empName = empName;
        this.empDpt = empDpt;
    }

    // 사원 정보 출력 메서드
    public void showEmpInfo() {
        System.out.println("사원 번호: " + empNo);
        System.out.println("사원 이름: " + empName);
        System.out.println("사원 부서: " + empDpt);
    }
}
