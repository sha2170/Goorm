package Mission02;

public class mission3_Triangle_0826 implements mission3_Shape_0826 {
	private double base;
	private double height;
	
	public mission3_Triangle_0826(double base, double height) {
		this.base = base;
		this.height = height;
	}
	

	public double calculateArea() {
		return 0.5 * base * height;
	}
}
