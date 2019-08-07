package homework1;

public class BoardDtoDemo {
	public static void main(String[] args) {
		//1.객체생성 => 생성자
		BoardDto b1 = new BoardDto(1,"성영한1","타이틀1","내용1",0,"2019-08-06");
		//2. 인스변수을 모두 가져와 본다. getter 메서드 사용
		int num = b1.getNum();
		String writer = b1.getWriter();
		String title = b1.getTitle();
		String content = b1.getContent();
		int hit = b1.getHit();
		String regdate = b1.getRegdate();
		//3. 출력해 본다.
		System.out.println(num +","+writer+","+title+","+content+","+hit+","+regdate);
		//4. 수정해본다. setter 메서드 사용
		b1.setNum(11);
		b1.setWriter("성영한11");
		
		//5. 모든 변수를 가져온다. getter 메서드 사용
		num = b1.getNum();
		writer = b1.getWriter();
		title = b1.getTitle();
		content = b1.getContent();
		hit = b1.getHit();
		regdate = b1.getRegdate();
		
		//6. 출력
		System.out.println(num +","+writer+","+title+","+content+","+hit+","+regdate);
		
		
		BoardDto b2 =new BoardDto(2,"성영한2","타이틀2","내용2",1,"2019-08-07");
		int num1 = b2.getNum();
		
		System.out.println(num1 +","+writer+","+title+","+content+","+hit+","+regdate);
		BoardDto b3 =new BoardDto(3,"성영한3","타이틀3","내용3",2,"2019-08-08");
		num = b3.getNum();
		
		System.out.println(num +","+writer+","+title+","+content+","+hit+","+regdate);
		
	
	}
}
