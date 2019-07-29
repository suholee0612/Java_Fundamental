package java_20190722;

public class StaticMethodDemo {
	String name;
	static double interestRate;

	public void m1() {
		System.out.println("m1() 메소드 호출");
	}

	public void m2() {
		// instance method에서는 instance 변수, static 변수 사용가능
		// instance method, static method 호출 가능
		name = "이수호";
		interestRate = 0.1;
		m1();
		m3();
	}

	public static void m3() {
		System.out.println("m3() 메소드 호출");
	}

	public static void m4() {
		// static method에서는 this를 사용할 수 없음.
		// static method에서는 instance 변수 사용할 수 없음. static 변수 사용가능
		// instance method 호출 불가능, static method 호출 가능
		// name = "홍길동";
		interestRate = 0.2;
		// m1();
		m3();

	}

	public static void main(String[] args) {
		StaticMethodDemo.m3();
		StaticMethodDemo.m4();
		StaticMethodDemo.interestRate = 1.4;
		m3();
		m4();
		interestRate = 1.4;

		StaticMethodDemo s1 = new StaticMethodDemo();
		s1.m1();
		s1.m2();
		s1.name = "sdfsdf";
	}
}
