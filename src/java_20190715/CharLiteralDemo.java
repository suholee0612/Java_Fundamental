package java_20190715;

public class CharLiteralDemo {
	public static void main(String[] args) {
		char c1 = '\uc774';
		char c2 = '\uc218';
		char c3 = '\ud638';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//char literal의 아스키코드 표현 => 65
		
		char c4 = 65;
		System.out.println(c4);
		
		//char literal의 문자표현 => ''
		
		char c5 = 'q';
		System.out.println(c5);
		
		char c6 = '\'';
		System.out.println(c6);
		char c7 = '\\';
		System.out.println(c7);
		
		//특수문자
		// \n => line feed
		// \t => tab
		// \\ => back slash
		// \' => single quotation
		// \" => double quotation
		
		String path = "aa\tbb";
		System.out.println(path);
		
	
	}
}