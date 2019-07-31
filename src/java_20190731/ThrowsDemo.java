package java_20190731;

public class ThrowsDemo {
	public static double getAverage(int[] temp) throws ArrayIndexOutOfBoundsException {
		int Korean = temp[0];
		int Math = temp[1];
		int English = temp[2];
		int History = temp[3];
		int sum = Korean + Math + English + History;
		return (double) sum / (double) 4;
	}

	public static void main(String[] args) {
		int[] exam = { 10, 20, 30 };
		try {
			double avg = getAverage(exam);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("한국어, 수학, 영어, 역사 4개 과목을 입력해야 합니다.");
		}
	}
}