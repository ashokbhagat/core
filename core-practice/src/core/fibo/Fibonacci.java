package core.fibo;

public class Fibonacci {

	static int limit = 10;
	static int index = 0;

	public static void main(String[] args) {
		// calcFibonanci();
		// calcFibonanciRecursion(5);

		for (int i = 1; i <= 5; i++) {
			System.out.println(calcFibonanciRecursion(10));
		}
	}

	private static void calcFibonanci() {

		int prev = 0;
		int next = 1;
		int current = 1;

		for (int i = 0; i < 5; i++) {
			current = prev + next;
			System.out.println(current);
			prev = next;
			next = current;
		}

	}

	private static int calcFibonanciRecursion(int number) {

		if (number == 1 || number == 2) {
			return 1;
		}

		return calcFibonanciRecursion(number - 1)
				+ calcFibonanciRecursion(number - 2); // tail recursion

	}

}
