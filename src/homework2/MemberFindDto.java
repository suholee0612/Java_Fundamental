package homework2;

public class MemberFindDto {
	private int seq;
	private String email;
	private String code;
	private String sdate;
	private String edate;

	// 생성자 , setter, getter 만들기
	public MemberFindDto(int seq, String email, String code, String sdate, String edate) {
		super();
		this.seq = seq;
		this.email = email;
		this.code = code;
		this.sdate = sdate;
		this.edate = edate;
	}

	// setter 만들기
	public void setSeq(int seq) {
		this.seq = seq;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	
	// getter 만들기
	public int getSeq() {
		return seq;
	}

	public String getEmail() {
		return email;
	}

	public String getCode() {
		return code;
	}

	public String getSdate() {
		return sdate;
	}

	public String getEdate() {
		return edate;
	}

}
