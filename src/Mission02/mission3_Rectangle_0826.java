package Mission02;

public class mission3_Rectangle_0826 implements mission3_Shape_0826 {
	private double width;
	private double height;
	
	public mission3_Rectangle_0826(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double calculateArea() {
		return width * height;
	}
}
