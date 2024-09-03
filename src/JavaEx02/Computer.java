package JavaEx02;

public class Computer extends Calculator {

	public double areaCircle(double r) {
		System.out.println("Computer areaCircle() 실행");
		return Math.PI*r*r;
	}
}
