package Mission02;

public class mission1_PairMain_0829 {
    public static void main(String[] args) {
        // Pair 클래스의 인스턴스 생성
        mission1_Pair_0829<String, Integer> pair = new mission1_Pair_0829<>("Hello", 222);

        // 데이터 출력
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());

        pair.setFirst("World");
        pair.setSecond(111);

        System.out.println("Updated Pair: " + pair);
    }
}
