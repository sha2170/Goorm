package Mission02;
public class mission1_0826 {
	private double width;
	private double height;
	
	public mission1_0826(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double result1() {
		return width * height;
	}
	
	public double result2() {
		return 2 * (width + height);
	}
	
	public void resultInfo() {
		System.out.println("직사각형의 넓이: " + result1());
		System.out.println("직사각형의 둘레: " + result2());
	}
}