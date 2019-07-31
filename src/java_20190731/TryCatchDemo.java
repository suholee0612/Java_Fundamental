package java_20190731;

public class TryCatchDemo {
	public static double getAvg(int Korean, int English) {
		int sum = Korean + English;
		double avg = (double) sum / (double) 2;
		return avg;
	}

	public static void main(String[] args) {
		try {
			int Korean = Integer.parseInt(args[0]);
			int English = Integer.parseInt(args[1]);
			double average = getAvg(Korean, English);
			System.out.printf("평균 : %f", average);
		} catch (NumberFormatException e1) {
			// System.err.println("예외 메세지 : "+e1.getMessage());
			// e1.printStackTrace(); => 예외 메세지 전체를 출력해준다.
			System.err.println("문자말고 숫자 넣어!");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.err.println("2개 넣어!");
		} finally {
			// 무조건 수행되는 블럭
			System.out.println("finally");

		}
	}
}