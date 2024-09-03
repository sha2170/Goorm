package Mission01;
import java.util.Scanner;
public class mission2_0823 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력: ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력: ");
		int age = sc.nextInt();

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		sc.close();
	}

}
