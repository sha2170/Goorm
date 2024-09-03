package JavaEx02;

public class Rect extends DrawingObject {

	public Rect() {
		penColor = "green";
	}

	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 선 그리기");
		
	}
	
	

}
