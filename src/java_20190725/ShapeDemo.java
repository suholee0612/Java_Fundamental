package java_20190725;

public class ShapeDemo {
	//추상 클래스의 다형성
	public static void run(Shape s) { //shpae s = new rectangle();
		s.draw();
	}

//	public static void run(Rectangle r) {
//		s.draw();
//	}

//	public static void run(Circle c) {
//		s.draw();
//	}

	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성할 수 없음..
		// Shape s = new Shape();
		// Rectangle r = new Rectangle();
		// Shape s1 = r;
		// s1.draw();

		run(new Rectangle());

		Shape s2 = new Circle();
		// s2.draw();

		run(s2);
	}
}