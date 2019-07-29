package java_20190722;

import java_20190722.aa.Notice;

public class Notice2Demo extends Notice {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		//public은 서로 다른 패키지도 접근 가능
		n1.number = 1;
		//protected는 서로 다른 패키지이면서 상속 받은 경우에는 접근 가능.
		//n1.title = "공지사항입니다.";
		//default => 같은 패키지 내에서만 접근 가능
		//n1.hit = 0;
		//private은 같은 클래스 내에서만 접근 가능.
		//n1.regdate = "2019";
		
		//부모 클래스인 Notice에서 접근할 수 있는 접근 한정자는 public, protected
		Notice2Demo n2 = new Notice2Demo();
		n2.number = 1;
		n2.title = "공지사항입니다.";
	}
}
