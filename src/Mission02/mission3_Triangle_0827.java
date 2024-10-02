package Mission02;

public class mission3_Triangle_0827 extends mission3_Shape_0827 {
	private double base;
	private double height;
	
	public mission3_Triangle_0827(double base, double height) {
		super("삼각형");
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculate() {
		return 0.5 * base * height;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("밑변: " + base + ", 높이: " + height);
	}
	
	
}
