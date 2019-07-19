package java_20190719;

public class CustomerDemo {
	public static void main(String[] args) {
		// Customer 객체 생성
		// Customer => Object type
		// c1 => reference
		// new Customer() = > Object
		Customer c1 = new Customer();
		c1.name = "이수호";
		c1.age = 34;
		c1.email = "doublej0612@gmail.com";
		c1.phone = "010-9191-0612";
		c1.balance = 30_000_000_000.77;
		c1.isReleased = false;

		System.out.printf("%s, %d, %s, %s, $%, .2f, %s", c1.name, c1.age, c1.email, c1.phone, c1.balance,
				c1.isReleased);

		System.out.println();
		
		Customer c2 = new Customer();
		c2.name = "이정진";
		c2.age = 33;
		c2.email = "shyboy860612@hanmail.net";
		c2.phone = "011-9191-0612";
		c2.balance = 9_000_000.44;
		c2.isReleased = true;

		
		//Customer c3 = c2;
		//c3.age = 32; 이러면 이정진의 33살의 나이만 32세로 바뀌고 나머지는 동일하게 나옴.
		
		 System.out.printf("%s, %d, %s, %s, ￦%, .2f, %s", c2.name, c2.age, c2.email, c2.phone, c2.balance, c2.isReleased);
	}
}
