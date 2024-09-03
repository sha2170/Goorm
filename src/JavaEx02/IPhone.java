package JavaEx02;

public class IPhone implements ISmartPhone {

	private String name;
	
	// 생성자에서 초기화
	public IPhone() {
		name = "아이폰";
		
	}
	@Override
	public void sendCall() {
		System.out.println(name + "으로 전화를 겁니다.");
	}

	@Override
	public void receiveCall() {
		System.out.println(name + "으로 전화를 받습니다.");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub

	}

}
