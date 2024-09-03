package Mission02;

public class mission3_Main_0827 {

	public static void main(String[] args) {
		// 도형 객체 배열 생성
		mission3_Shape_0827[] shapes = new mission3_Shape_0827[3];

		// 각 도형 객체 생성
		shapes[0] = new mission3_Circle_0827(5); // 반지름이 5인 원
		shapes[1] = new mission3_Rectangle_0827(4, 6); // 가로 4, 세로 6인 사각형
		shapes[2] = new mission3_Triangle_0827(3, 4); // 밑변 3, 높이 4인 삼각형
		
		// 배열에 저장된 각 도형의 면적 계산 및 출력
		for (mission3_Shape_0827 shape : shapes) {
			shape.draw();
			System.out.println(shape.getName() + "의 면적: " + shape.calculate());
			System.out.println();
		}
	}

}
