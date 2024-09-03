package JavaEx02;

public class MultiThread extends Thread {
	
	// MultiThread 클래스는 Thread 클래스를 상속받아 스레드를 구현
	
	private int id;
	// id라는 인스턴스 변수를 선언하고 이를 통해 각 스레드 구별 가능
	// id는 스레드를 생성할 때 설정되며, 각 스레드에 고유한 식별 값을 부여함
	
	public MultiThread(int id) {
		this.id = id;
		// 생성자는 id 값을 초기화함
		// 스레드 생성 시 MultiThread(int id) 생성자를 호출하여 스레드의 id를 설정함
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("thread(" + id + "), i: " + i);
			
			// Thread 클래스의 run 메서드를 오버라이드하여 스레드가 수행할 작업을 정의함
			// run 메서드에서는 반복문을 통해 thread(id), i:x 형식의 메시지 출력
		}
	}
	
	
}
