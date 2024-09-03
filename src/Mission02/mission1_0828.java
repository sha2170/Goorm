package Mission02;
public class mission1_0828 {
	public static void main(String[] args) {
		// 첫 번째 thread
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				for(int i=1; i<=10; i++) {
					System.out.println("Thread1: " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.getStackTrace();
					}
				}
			}
		});
		// 두 번째 thread
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				for(char c='A'; c<='J'; c++) {
					System.out.println("Thread2: " + c);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.getStackTrace();
					}
				}
			}
		});
		
		thread1.start();
		thread2.start();
	}
}