package Mission02;

public class mission3_Circle_0826 implements mission3_Shape_0826 {
	private double radius;
	
	public mission3_Circle_0826(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
}
