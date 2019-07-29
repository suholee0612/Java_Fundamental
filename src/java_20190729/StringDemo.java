package java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		String ssn = "860612-1234567";
		char c = ssn.charAt(11);
		System.out.println(c);

		ssn = ssn.concat("abcd");
		System.out.println(ssn);

		String fileName = "abc.def.ghi.jkl.mno";
		if (fileName.endsWith("zip")) {
			System.out.println("압축 파일 입니다.");
		} else if (fileName.endsWith("doc")) {
			System.out.println("워드 문서 입니다.");
		} else {
			System.out.println("그 외 파일 입니다.");
		}
		System.out.println(fileName.equalsIgnoreCase("Abc.dEf.GhI.JKl.mnO"));

		int index = ssn.indexOf("-");
		System.out.println(index);
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		// 860612-1234567
		String first = fileName.substring(0, fileName.lastIndexOf("."));
		String second = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println(first);
		System.out.println(second);

	}
}