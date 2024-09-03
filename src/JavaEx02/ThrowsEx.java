package JavaEx02;

public class ThrowsEx {
	public static void main(String[] args) {
		// throws가 붙어있는 메서드는 반드시 try 블록 내에서 호출되어야 하고
		// catch 블록에서 예외를 처리해야 함
		
		// throws 키워드를 사용해 예외를 호출한 메서드로 전달하고, 
		// 이를 try ~ catch 블록으로 처리함
		try {
			findClass(); // findClass라는 메서드를 호출
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			// findClass 메서드는 ClassNotFoundException이라는 예외를 던질 수 있기 떄문에
			// try ~ catch 블록 안에서 호출해야함
			// ClassNotFoundException 예외가 발생했을 때 실행됨
		}
	}
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.long.String2");
		// Class.forName 메서드를 사용해 클래스 이름을 기반으로 클래스를 로드하려고 시도함
		// Class.forName은 문자열로 주어진 클래스 이름을 기반으로 해당 클래스를 찾고, 로드하려고 함
		// 하지만 주어진 클래스 이름이 잘못되었거나 해당 클래스가 존재하지 않으면 ClassNotFoundException 예외가 발생
		
		// findClass 메서드는 이 예외를 처리하지 않고, throws ClassNotFoundException으로 예외를 호출한 메서드로 미룸
		// ClassNotFoundException 발생 > java.long.String2라는 클래스가 존재하지 않기 때문
	}
	
}

// throws 키워드는 예외를 메서드 내부에서 처리하지 않고, 호출한 메서드로 예외를 전달할 때 사용됨
// findClass 메서드는 예외를 직접 처리하지 않고, 호출한 main 메서드로 예외를 던져 main에서 처리하도록 함
