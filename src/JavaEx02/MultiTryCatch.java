package JavaEx02;

public class MultiTryCatch {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3}; // 길이가 3인 정수형 배열을 선언하고 초기화
		
		try {
			//System.out.println(arr[5]); 
			// 이 코드는 arr[5]를 출력하려고 하지만 배열의 범위를 벗어나 예외가 발생
			// ArrayIndexOutBoundsException이 처리
			System.out.println(Integer.parseInt("a100"));
			// 이 코드는 문자열 'a100'을 정수로 변환하려고 시도
			// 'a100'은 숫자가 아니므로 NumberFormatException이 발생
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
			// ArrayIndexOutofBoundsException을 처리하기 위한 블록
			// 만약 배열의 인덱스를 잘못 참조하여 범위를 벗어나면 이 블록이 실행됨
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			// NumberFormatException을 처리하기 위한 블록
			// 만약 문자열을 숫자로 변환하는 과정에서 문제가 발생하면 이 블록이 실행됨
		} finally {
			// 예외 발생 여부와 상관없이 무조건 실행됨
			// 이 블록은 주로 파일 닫기, 데이터베이스 연결 종료 등과 같이 예외 발생 여부와
			// 관계없이 꼭 실행되어야 하는 코드를 작성할 때 사용함
			System.out.println("다시 실행하세요.");
		}

	}

}
