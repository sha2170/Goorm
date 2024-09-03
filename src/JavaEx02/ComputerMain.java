package JavaEx02;

public class ComputerMain {

	public static void main(String[] args) {
		int r = 10;
		Calculator2 cal2 = new Calculator2();
		System.out.println("원의 면적: " + cal2.areaCircle(r));
		
		System.out.println();
		Computer com = new Computer();
		System.out.println("원의 면적: " + com.areaCircle(r));

	}

}
