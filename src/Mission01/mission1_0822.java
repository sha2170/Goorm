package Mission01;

import java.util.Scanner;

public class mission1_0822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int number = sc.nextInt();

		if(number % 2 == 0) {
			System.out.println(number + "는 짝수입니다.");
		}
		else { 
			System.out.println(number + "는 홀수입니다.");
		}
	sc.close();
	}
}