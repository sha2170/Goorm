package Mission02;
import java.util.Scanner;
import java.util.Map;
import java.util.function.*;
import java.util.HashMap;

public class mission3_0828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 두 개의 숫자와 연산자 입력
		System.out.print("첫 번째 숫자 입력: ");
		double num1 = sc.nextDouble();
		
		System.out.print("두 번째 숫자 입력: ");
		double num2 = sc.nextDouble();
		
		System.out.print("연산자 입력: ");
		String operator = sc.next();
		
		// 연산자에 따른 람다 표현식
		Map<String, BiFunction<Double, Double, Double >> operations = new HashMap<>();
		operations.put("+", (a, b) -> a + b);
		operations.put("-", (a, b) -> a - b);
		operations.put("*", (a, b) -> a * b);
		operations.put("/", (a, b) -> {
			if (b == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return a / b;
		});
		
		if (operations.containsKey(operator)) {
			double result = operations.get(operator).apply(num1, num2);
			System.out.println("결과: " + result);
		} else {
			System.out.println("존재하지 않는 연산자.");
		}
		sc.close();
		
	}
}
