package JavaEx02;

public class ParentChildMain {

	public static void main(String[] args) {
		// 자식 클래스 객체 생성해서 부모 클래스의 멤버 사용
		Child ob = new Child();
		
		ob.setChild();
		ob.showChild();
		ob.setParent();
		ob.showParent();

	}

}
