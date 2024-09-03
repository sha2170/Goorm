package Mission02;

public class mission1_Rectangle_0827 implements mission1_Shape_0827 {
	private double width;
	private double height;
	
	// 생성자
	public mission1_Rectangle_0827(double width, double height) {
		this.width = width;
		this.height =height;
	}

	// 면적 계산 메서드 구현
	@Override
	public double calculate() {
		return width * height;
	}
	
	
}