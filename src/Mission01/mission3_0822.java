package Mission01;
import java.util.Arrays;
import java.util.Scanner;

public class mission3_0822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int[] numbers = new int[5];

		System.out.print("5개의 정수를 입력하세요: ");
		for(int i=0; i<5; i++) {
			numbers[i] = sc.nextInt();
		}

		Arrays.sort(numbers);

		System.out.println("오름차순으로 정렬된 5개의 숫자: ");
		for(int i=0; i<5; i++) {
			System.out.print(numbers[i] + " ");
		}

		sc.close();

	}
}