package Mission02;

public class mission3_ShapeMain_0826 {

	public static void main(String[] args) {
		mission3_Shape_0826[] shapes = new mission3_Shape_0826[3];
		shapes[0] = new mission3_Circle_0826(5.0);
		shapes[1] = new mission3_Rectangle_0826(4.0, 6.0);
		shapes[2] = new mission3_Triangle_0826(3.0, 7.0);
		
		for (mission3_Shape_0826 shape : shapes) {
			System.out.println("도형의 면적: " + shape.calculateArea());
		}
	}

}
