package Mission02;

// 도형 인터페이스 정의
interface Drawable {
	double calculate();
	void draw();
}

// 도형 추상 클래스 정의
abstract class mission3_Shape_0827 implements Drawable {
	protected String name;
	
	public mission3_Shape_0827(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// 도형의 면적을 계산하는 추상 메서드
	public abstract double calculate();
	
	// 도형의 그리기 메서드 (기본 구현)
	public void draw() {
		System.out.println(name + "을 그립니다.");
	}
}
