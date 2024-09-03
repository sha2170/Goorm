package Mission02;

public class mission3_Circle_0827 extends mission3_Shape_0827 {
	private double radius;
	
	public mission3_Circle_0827(double radius) {
		super("원");
		this.radius = radius;
	}

	@Override
	public double calculate() {
		return Math.PI * radius * radius;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("반지름: " + radius);
	}
	
}
