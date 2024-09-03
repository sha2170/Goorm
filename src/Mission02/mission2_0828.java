package Mission02;
import java.util.Scanner;
public class mission2_0828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받기
		System.out.print("문자열 입력: ");
		String input = sc.nextLine();
		
		// 문자열 뒤집기
		String reversedString = new StringBuilder(input).reverse().toString();
		
		// 뒤집은 문자열 대소문자 변환
		StringBuilder transformedString = new StringBuilder();
		for (char c : reversedString.toCharArray()) {
			if(Character.isUpperCase(c)) {
				transformedString.append(Character.toLowerCase(c));
			} else if(Character.isLowerCase(c)) {
				transformedString.append(Character.toUpperCase(c));
			} else {
				transformedString.append(c);
			}
		}
		
		System.out.println("변환된 문자열: " + transformedString.toString());
		sc.close();
	}
	
	
}