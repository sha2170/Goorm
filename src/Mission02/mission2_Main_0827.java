package Mission02;

import java.util.Scanner;
public class mission2_Main_0827 {

	public static void main(String[] args) {
		mission2_Calculator_0827 calculator = new mission2_Calculator_0827();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("첫 번째 숫자를 입력하세요: ");
			double num1 = sc.nextDouble();
			
			System.out.print("연산자를 입력하세요: ");
			String operator = sc.next();
			
			System.out.print("두 번째 숫자를 입력하세요: ");
			double num2 = sc.nextDouble();
			
			double result = 0;
			
			switch (operator) {
				case "+":
					result = calculator.add(num1, num2);
					break;
				case "-":
					result = calculator.minus(num1, num2);
					break;
				case "*":
					result = calculator.multiply(num1, num2);
					break;
				case "/":
					result = calculator.divide(num1, num2);
					break;
				default:
					System.out.println("잘못된 연산자입니다.");
					return;
			}
			
			System.out.println("결과: " + result);
		} catch (ArithmeticException e) {
			// 0으로 나누기 예외 처리
			System.out.println("오류: " + e.getMessage());
		} catch (Exception e) {
			// 다른 예외 처리
			System.out.println("오류가 발생했습니다: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
