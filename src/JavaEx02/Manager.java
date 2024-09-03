package JavaEx02;

// Employee 클래스를 상속받는 Manager 클래스
public class Manager extends Employee {
    // 추가 멤버 필드
    private String position;

    // 필드 값 저장 메서드
    public void setManager(String empNo, String empName, String empDpt, String position) {
        // 부모 클래스의 메서드를 호출하여 상위 클래스 필드를 설정
        setEmployee(empNo, empName, empDpt);
        this.position = position;
    }

    // 사원 정보 및 직위 출력 메서드
    public void showManagerInfo() {
        // 부모 클래스의 메서드를 호출하여 사원 정보 출력
        showEmpInfo();
        System.out.println("직위: " + position);
    }
}
