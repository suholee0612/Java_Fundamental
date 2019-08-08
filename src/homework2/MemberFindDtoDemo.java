package homework2;

public class MemberFindDtoDemo {
	public static void main(String[] args) {
		// 1. 객체를 생성한다.
		MemberFindDto m1 = new MemberFindDto(1, "suholee1@ganada.com", "111", "2019-08-01", "2019-08-02");
		// 2. 객체의 내용을 출력 해본다.
		System.out.println(m1.getSeq());
		System.out.println(m1.getEmail());
		System.out.println(m1.getCode());
		System.out.println(m1.getSdate());
		System.out.println(m1.getEdate());

		System.out.println();

		// 3. 객체의 내용을 수정 해본다.
		m1.setSeq(12);
		m1.setEmail("suholee1@ganada.net");
		m1.setCode("121212");
		m1.setSdate("2020-08-01");
		m1.setEdate("2020-08-02");

		// 4. 객체의 내용을 출력 해본다.
		System.out.println(m1.getSeq());
		System.out.println(m1.getEmail());
		System.out.println(m1.getCode());
		System.out.println(m1.getSdate());
		System.out.println(m1.getEdate());

		System.out.println();

		MemberFindDto m2 = new MemberFindDto(2, "suholee2@ganada.com", "222", "2019-08-02", "2019-08-03");

		int seq = m2.getSeq();
		String email = m2.getEmail();
		String code = m2.getCode();
		String sdate = m2.getSdate();
		String edate = m2.getEdate();

		System.out.println(seq + "," + email + "," + code + "," + sdate + "," + edate);

		m2.setSeq(23);
		m2.setEmail("suholee2@ganada.net");
		m2.setCode("232323");
		m2.setSdate("2020-08-02");
		m2.setEdate("2020-08-03");

		seq = m2.getSeq();
		email = m2.getEmail();
		code = m2.getCode();
		sdate = m2.getSdate();
		edate = m2.getEdate();

		System.out.println(seq + "," + email + "," + code + "," + sdate + "," + edate);

		System.out.println();

		MemberFindDto m3 = new MemberFindDto(3, "suholee3@ganada.com", "333", "2019-08-03", "2019-08-04");

		System.out.println(m3.getSeq());
		System.out.println(m3.getEmail());
		System.out.println(m3.getCode());
		System.out.println(m3.getSdate());
		System.out.println(m3.getEdate());

		System.out.println();
		
		m3.setSeq(34);
		m3.setEmail("suholee3@ganada.net");
		m3.setCode("343434");
		m3.setSdate("2020-08-03");
		m3.setEdate("2020-08-04");

		System.out.println(m3.getSeq());
		System.out.println(m3.getEmail());
		System.out.println(m3.getCode());
		System.out.println(m3.getSdate());
		System.out.println(m3.getEdate());

	}
}