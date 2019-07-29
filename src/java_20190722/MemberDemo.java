package java_20190722;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member();
		// m.name = "";
		m.setName("이수호");
		// System.out.println(m.name);
		m.setZipcode("01177");
		m.setAddr1("서울특별시");
		m.setAddr2("강북구");
		m.setSsn1("860612");
		m.setSsn2("-1xxxxxx");
		m.setAge(34);
		m.setRegdate("2019-07-22");
		System.out.println(m.getName());
		System.out.println(m.getZipcode());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getSsn1());
		System.out.println(m.getSsn2());
		System.out.println(m.getAge());
		System.out.println(m.getRegdate());
	}
}