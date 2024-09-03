package Mission01;

import java.util.Scanner;

public class mission1_0823 {
	
	public static int plus(int a, int b) {
		return a + b;
	}
	public static int minus(int a, int b) {
		return a - b;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		int num2 = sc.nextInt();
		
		int add = plus(num1, num2);
		int subtract = minus(num1, num2);
		
		System.out.println("더하기 결과: " + num1 + "+" + num2 + "=" + add);
		System.out.println("빼기 결과: " + num1 + "-" + num2 + "=" + subtract);
		
		
	}
}