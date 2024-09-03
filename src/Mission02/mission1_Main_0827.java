package Mission02;

public class mission1_Main_0827 {
    public static void main(String[] args) {
    	
    	// 원 객체 생성 (반지름 : 5)
        mission1_Shape_0827 circle = new mission1_Circle_0827(5);
        System.out.println("원 면적: " + circle.calculate());

        // 사각형 객체 생성 (가로 : 4, 세로 : 6)
        mission1_Shape_0827 rectangle = new mission1_Rectangle_0827(4, 6);
        System.out.println("사각형 면적: " + rectangle.calculate());

        // 삼각형 객체 생성 (밑변 : 3, 높이 : 4)
        mission1_Shape_0827 triangle = new mission1_Triangle_0827(3, 4);
        System.out.println("삼각형 면적: " + triangle.calculate());
    }
}
