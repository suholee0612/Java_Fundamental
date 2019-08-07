package homework1.self;

public class BoardDtoDemo {
	public static void main(String[] args) {
		BoardDto b1 = new BoardDto(1, "이수호1", "타이틀1", "내용1", 1, "2019-08-07);");
		int num = b1.getNum();
		String writer = b1.getWriter();
		String title = b1.getTitle();
		String content = b1.getContent();
		int hit = b1.getHit();
		String regdate = b1.getRegdate();
		System.out.println(num+","+writer+","+title+","+content+","+hit+","+regdate);

		b1.setNum(11);
		b1.setWriter("이수호11");
		b1.setTitle("타이틀11");
		b1.setContent("내용11");
		b1.setHit(11);
		b1.setRegdate("2019-09-07");
		
		num = b1.getNum();
		writer = b1.getWriter();
		title = b1.getTitle();
		content = b1.getContent();
		hit = b1.getHit();
		regdate = b1.getRegdate();
		
		System.out.println(num+","+writer+","+title+","+content+","+hit+","+regdate);
		
		BoardDto b2 = new BoardDto(2, "이수호2","타이틀2","내용2",2,"2019-08-08");
//		int num2 = b2.getNum();
//		String writer2 = b2.getWriter();
//		String title2 = b2.getTitle();
//		String content2 = b2.getContent();
//		int hit2 = b2.getHit();
//		String regdate2 = b2.getRegdate();
		num = b2.getNum();
		writer = b2.getWriter();
		title = b2.getTitle();
		content = b2.getContent();
		hit = b2.getHit();
		regdate = b2.getRegdate();
		System.out.println(num+","+writer+","+title+","+content+","+hit+","+regdate);
		
		b2.setNum(22);
		b2.setWriter("이수호22");
		b2.setTitle("타이틀22");
		b2.setContent("내용22");
		b2.setHit(22);
		b2.setRegdate("2019-09-08");
		
		num = b2.getNum();
		writer = b2.getWriter();
		title = b2.getTitle();
		content = b2.getContent();
		hit = b2.getHit();
		regdate = b2.getRegdate();
		System.out.println(num+","+writer+","+title+","+content+","+hit+","+regdate);
		
		BoardDto b3 = new BoardDto(3,"이수호3","타이틀3","내용3",3,"2019-08-09");
		
		int num3 = b3.getNum();
		String writer3 = b3.getWriter();
		String title3 = b3.getTitle();
		String content3 = b3.getContent();
		int hit3 = b3.getHit();
		String regdate3 = b3.getRegdate();
		
		System.out.println(num3+","+writer3+","+title3+","+content3+","+hit3+","+regdate3);
		
		b3.setNum(33);
		b3.setWriter("이수호33");
		b3.setTitle("타이틀33");
		b3.setContent("내용33");
		b3.setHit(33);
		b3.setRegdate("2019-09-09");
		
		num3 = b3.getNum();
		writer3 = b3.getWriter();
		title3 = b3.getTitle();
		content3 = b3.getContent();
		hit3 = b3.getHit();
		regdate3 = b3.getRegdate();
		
		System.out.println(num3+","+writer3+","+title3+","+content3+","+hit3+","+regdate3);
		
		
	}

}
