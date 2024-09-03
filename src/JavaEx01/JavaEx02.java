package JavaEx01;

import java.util.Scanner;

public class JavaEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 반복문
		// for : 고정된 횟수만큼
		// 향상된 for 문 (for ~ each) : 배열이나 컬렉션의 모든 요소를 순차적으로 반복
		// while 문 : 조건식이 참인동안 반복
		// do ~ while 문 : 코드 블록을 먼저 실행하고, 조건식이 참이면 반복실행

		// for 문
		// 사용자가 입력한 숫자에 대해 1부터 10까지의 곱셈표 출력
		System.out.print("곱셈표를 출력할 숫자를 입력: ");
		int number = sc.nextInt();

		for(int i=1; i<=10; i++) {
			System.out.println(number + "*" + i + "=" + (number*i));
		}

		// for-each문
		// 사용자가 입력한 정수 배열의 모든 요소를 출력
		System.out.print("배열의 요소 수를 입력: ");
		int n = sc.nextInt();
		int[] array = new int[n];

		System.out.println(n+ "개의 정수를 입력하세요.");
		for (int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("배열의 요소 : ");
		for(int a : array) {
			// 배열의 각 요소 출력
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println();

		// while 문
		// 사용자가 입력한 숫자까지의 합을 계산해서 출력(10 : 1-10까지의 합)
		System.out.print("합을 계산할 숫자를 입력: ");
		int limit =sc.nextInt();
		int sum = 0; // 합을 저장할 변수 sum, 0으로 초기화
		int count = 1; // 반복을 제어할 변수 count, 1부터 시작하기 때문에 count 값 1
		while (count <= limit) {
			// count가 limit보다 작거나 같을 동안 sum에 count 더하기
			sum += count; // sum = sum + count
			count++; // count 증가 : count = count + 1
		}
		System.out.println("1부터 " + limit + "까지의 합은 " + sum);

		// 사용자가 맞출 때까지 숫자를 추축하는 프로그램
		int secret = 7; // 맞춰야할 숫자
		int guess;

		System.out.print("숫자를 맞춰보세요(1~10)");
		guess = sc.nextInt();

		while(guess != secret) {
			System.out.print("숫자를 맞춰보세요(1~10)");
			guess = sc.nextInt();
		}
		System.out.println("축하합니다 ! 정답입니다.");

		// do~while 문 : while문 안에 구문을 한번은 실행해야할 때, 조건식을 나중에 비교
		do {
			System.out.print("숫자를 맞춰보세요(1~10)");
			guess = sc.nextInt();
		} while(guess != secret);

		System.out.println("축하합니다 ! 정답입니다.");

	}

}
