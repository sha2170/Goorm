package JavaEx02;

public class Myrunnable implements Runnable {

	@Override
	public void run() {
		
		// Runnable 인터페이스는 run 메서드를 선언하고 있으며, 스레드가 실행할 작업을 정의함
		// run 메서드 안에 스레드가 수행할 작업을 작성함
		
		for(int i=1; i<=5; i++) {
			System.out.println("Runnable is running - Count: " + i);
		
			// 스레드가 수행할 작업으로, 1부터 5까지의 숫자를 출력하고, 
			// 각 숫자 사이에 500ms의 지연을 추가함
			// 예를 들어 Runnable is running - Count: 2와 같은 메시지 출력함
			
			
			try {
				Thread.sleep(500);
				
				// 스레드가 각 작업을 수행할 때, 위 메서드를 사용하여 500ms 동안 지연을 추가함
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				// Thread.Sleep 메서드는 InterruptedException을 던질 수 있으므로 이를 처리해야 함
				// 블록에서 예외가 발생했을 때 스택 트레이스를 출력함
				// 이 예외 처리는 스레드가 지연 중 인터럽트될 수 있는 상황에 대비함
			}
		}
		
	}

}
