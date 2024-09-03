package JavaEx02;

public class Circle extends DrawingObject{
	public Circle() {
		penColor = "blue";
	}

	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 선 그리기");
		
	}
	
	
}
