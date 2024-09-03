package Mission02;
import java.util.Scanner;
import java.util.HashMap;

public class mission2_0829 {
    private HashMap<String, Integer> studentScores;

    public mission2_0829() {
        studentScores = new HashMap<>();
    }

    // 학생 점수 추가
    public void addScore(String name, int score) {
        studentScores.put(name, score);
        System.out.println(name + "학생의 점수가 추가되었습니다.");
    }

    // 특정 학생의 점수 조회
    public void getScore(String name) {
        if(studentScores.containsKey(name)) {
            System.out.println(name + "학생의 점수" + studentScores.get(name));
        } else {
            System.out.println(name + "학생의 점수를 찾을 수 없습니다.");
        }
    }

    // 전체 학생 점수 출력
    public void allScores() {
        System.out.print("전체 학생 점수: ");
        for (String name : studentScores.keySet()) {
            System.out.println(name + ": " + studentScores.get(name));
        }
    }

    // 특정 학생 데이터 삭제
    public void removeStudent(String name) {
        if(studentScores.containsKey(name)) {
            studentScores.remove(name);
            System.out.println(name + " 학생의 데이터가 삭제되었습니다.");
        } else {
            System.out.println(name + " 학생의 데이터를 찾을 수 없습니다.");
        }
    }

    public static void main(String[] args) {
        mission2_0829 mission = new mission2_0829();
        Scanner sc = new Scanner(System.in);
        String name;
        int score;

        // 예시 데이터 추가
        mission.addScore("Amy", 100);
        mission.addScore("Boom", 90);
        mission.addScore("Clone", 20);

        // 전체 데이터 출력
        System.out.println("\n전체 데이터 출력.");
        mission.allScores();

        // 특정 학생 점수 검색
        System.out.print("\n조회할 학생 이름 입력: ");
        name = sc.nextLine();
        mission.getScore(name);

        // 특정 학생 데이터 삭제
        System.out.print("\n삭제할 학생 이름 입력: ");
        name = sc.nextLine();
        mission.removeStudent(name);

        // 삭제 후 전체 데이터 출력
        System.out.println("\n삭제 후 전체 데이터 출력: ");
        mission.allScores();

        sc.close();
    }
}
