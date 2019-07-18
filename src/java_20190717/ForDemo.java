package java_20190717;

public class ForDemo {
	public static void main(String[] args) {
		
		 int sum = 0; for(int i = 1 ; i<=10 ; i++) {
			// if(i%2 == 0) 짝수의 총 합을 구할 때 쓴다.
			 sum = sum + i; }
		 		System.out.printf("1부터 10까지 총 합은 %d입니다.%n", sum);
		 
		 for(int first = 2; first <= 9; first++) {
			 for(int second = 1; second <= 9; second++) { 
				 System.out.printf("%d * %d = %d%n", first, second, first*second);
			 }
			 System.out.println();
		 }
		

		for (int i = 0; i < 5; i++) { // 행
			for (int j = 0; j < 5 - i; j++) { // 열
				System.out.print("&");
			}
					System.out.println();
		}
				 
		for(int n = 9 ; n>=2 ; n--) {
			for(int m = 1; m<=9; m++) {
				System.out.printf("%d * %d = %d%n",  n, m, n * m);
			}
				System.out.println();
		}
		
	}
}
		
		 

	
