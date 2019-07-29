package java_20190723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//ctrl+shift+o
//import java.lang.String; 자동으로 들어있음.

public class CalendarDemo {
	public static String console() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		Calendar c = new Calendar();
		while (true) {
			System.out.print("날짜를 입력하세요>");
			String readLine = console();
			if (readLine.equals("exit"))
				break;

			// split 메소드는 공백으로 문자열을 분리시켜 배열로 반환한다.
			String[] data = readLine.split(" ");
			int datalengths = data.length;
			if (datalengths == 1) {
				// String syear = data[0];
				// 문자열을 int로 변환하는 메소드
				int year = Integer.parseInt(data[0]);
				//c.print(year);
			} else if (datalengths == 2) {
				// String syear = data[0];
				// String smonth = data[1];
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				c.print(year, month);
			} else if (datalengths == 3) {
				// String syear = data[0];
				// String smonth = data[1];
				// String sday = data[2];
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				int day = Integer.parseInt(data[2]);
				c.print(year, month, day);
			} else {

			}

		}
	}
}