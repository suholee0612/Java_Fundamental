package homework1;

public class BoardDto {
	private int num;
	private String writer;
	private String title;
	private String content;
	private int hit;
	private String regdate;

	// 생성자
	public BoardDto(int num, String writer, String title, String content, int hit, String regdate) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.regdate = regdate;
	}

	// num에 대한 gettter 메서드 getNum => num을 가져올 수 있는 메서드
	public int getNum() {
		return num;
	}

	// num에 대한 setter 메서드 setNum => num을 수정할 수 있는 메서드
	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}