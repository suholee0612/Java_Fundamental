package java_20190717;

public class ContinueDemo {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				continue;
			sum = sum + i;
		}
		System.out.printf("1부터 5까지의 합은 %d입니다.%n", sum);

		outter: for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {
				if (second == 5)
					continue outter; // 끝에 label(outter)를 빼주면 각 구구단에서 x*5만 빠진다.
				
				// 4*7=28까지만 넣고 싶을 때. break outter가 아닌 break만 쓰면 4*8과 4*9를 제외하고 전체 구구단이 나온다.
				System.out.printf("%d * %d = %d%n", first, second, first * second);
			}
			System.out.println();
		}

		if(true) return; //return문 이후로는 출력을 하지 않음. if(false)는 밑으로 수행되지 않음.
		
		for (int i = 0; i < 5; i++) { // 행
			for (int j = 0; j < 5 - i; j++) { // 열
				System.out.print("&");
			}
			System.out.println();
		}

		for (int n = 9; n >= 2; n--) {
			for (int m = 1; m <= 9; m++) {
				System.out.printf("%d * %d = %d%n", n, m, n * m);
			}
			System.out.println();
		}

	}
}
