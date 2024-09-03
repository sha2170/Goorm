package Mission02;

public class mission2_Calculator_0827 {
	// 덧셈 메서드
	public double add(double a, double b) {
		return a + b;
	}
	
	// 뺄셈 메서드
	public double minus(double a, double b) {
		return a - b;
	}
	
	// 곱셈 메서드
	public double multiply(double a, double b) {
		return a * b;
	}
	
	// 나눗셈 메서드
	public double divide(double a, double b) throws ArithmeticException{
		if (b == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		return a / b;
	}
	
}
