package JavaEx02;

public class Triangle extends DrawingObject {
	public Triangle() {
		penColor = "pink";
	}

	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 선 그리기");
		
	}
	
}


