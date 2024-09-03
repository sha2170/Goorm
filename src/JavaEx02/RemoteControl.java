package JavaEx02;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메서드 : 실행 블록이 없는 메서드
	default void setMute(boolean mute) { //음소거 여부
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메서드 (static method)
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
