package java_20190725.step1;

public class FootNanoStopWatch {
	long startTime;
	long endTime;

	long startNanoTime;
	long endNanoTime;

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	public double getElapsedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / (double) 1000000000;
	}

	public static void main(String[] args) {
		FootStopWatch f1 = new FootStopWatch();
		FootNanoStopWatch f2 = new FootNanoStopWatch();

		f1.startTime = System.currentTimeMillis();
		f2.startNanoTime = System.nanoTime();

		for (long i = 0; i < 30_000_000_000l; i++) {

		}

		f1.endTime = System.currentTimeMillis();
		f2.endNanoTime = System.nanoTime();

		double elapsedTime = f1.getElapsedTime();
		double elapsedNanoTime = f2.getElapsedNanoTime();

		System.out.printf("경과시간 : %.3f\n", elapsedTime);
		System.out.printf("경과시간 : %.9f", elapsedNanoTime);
	}
}
