package Mission02;

public class mission3_Rectangle_0827 extends mission3_Shape_0827 {
	private double width;
	private double height;
	
	public mission3_Rectangle_0827(double width, double height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculate() {
		return width * height;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("가로: " + width + ", 세로: " + height);
	}
	
	
	
}
