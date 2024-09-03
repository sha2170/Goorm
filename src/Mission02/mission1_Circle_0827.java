package Mission02;

public class mission1_Circle_0827 implements mission1_Shape_0827 {
	private double radius;
	
	// 생성자
	public mission1_Circle_0827(double radius) {
		this.radius = radius;
	}
	
	// 면적 계산 메서드 구현
	@Override
	public double calculate() {
		return Math.PI * radius * radius;
	}
	
	
}