package java_20190719;

public class Customer {
	public String name;
	public String email;
	public String phone; //int(정수)로 잡아버리면 011-, 010- 8진수와 마이너스로 잡힐 수 있음.
	public int age;
	public double balance;
	public boolean isReleased;
	public static double interestRate;
	public static final String BANKNAME="신한은행";

}
