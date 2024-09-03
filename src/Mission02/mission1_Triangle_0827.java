package Mission02;

public class mission1_Triangle_0827 implements mission1_Shape_0827 {
	private double base;
	private double height;
	
	// 생성자
	public mission1_Triangle_0827(double base, double height) {
		this.base = base;
		this.height = height;
	}

	// 면적 계산 메서드 구현
	@Override
	public double calculate() {
		return 0.5 * base * height;
	}
	
	
}