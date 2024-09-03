package JavaEx02;

public class DrawingMain {

	public static void main(String[] args) {
		Line line =  new Line();
		line.draw();
		
		Circle circle = new Circle();
		circle.draw();
		
		Rect rect = new Rect();
		rect.draw();
		
		Triangle tri = new Triangle();
		tri.draw();

	}

}
