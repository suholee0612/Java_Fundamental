package java_20190723;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("leesuho", "isooho", "leesuho@suho.com", 1);
		/*a.setId("leesuho");
		a.setPwd("isooho");
		a.setEmail("leesuho@suho.com");
		a.setLevel(1);*/
		System.out.printf("%s, %s, %s, %d %n", a.getId(), a.getPwd(), a.getEmail(), a.getLevel());
	}

}
