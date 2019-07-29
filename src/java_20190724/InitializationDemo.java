package java_20190724;

//i18n => 국제화 I nternationalizatio n
//l10n => 지역화 L ocalizatio n
public class InitializationDemo {
	// static 초기화
	static {
		System.out.println("static area"); //1
		b = 100;
	}
	// instance 초기화 블럭
	{
		System.out.println("instance area"); //4
		a = 10;
	}
	int a;
	static int b;
	static final int C = 10;
	// static 초기화
	
	// 생성자에서 초기화 할 수 있는 변수는 instance 변수
	public InitializationDemo(int a) {
		// super(); 모든 생성자에는 super가 숨어있다.
		this.a = a;
	}

	public static void main(String[] args) { //2
		System.out.println("main area");
		InitializationDemo i = new InitializationDemo(1000); //3
		System.out.println(i.a);
		System.out.println(b);
		System.out.println(C);
	}

}
