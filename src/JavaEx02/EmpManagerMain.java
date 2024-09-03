package JavaEx02;

public class EmpManagerMain {
    public static void main(String[] args) {
        // Manager 객체 생성
        Manager manager = new Manager();

        // Manager 객체에 데이터 저장
        manager.setManager("2023", "홍길동", "개발부", "팀장");

        // Manager 정보 출력
        manager.showManagerInfo();
    }
}
