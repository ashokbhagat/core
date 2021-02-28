package core.factorial;


public class Factorial {

	public static void main(String[] args) {

		// Scanner scanner = new Scanner(System.in);
		// int number=Integer.parseInt(scanner.next());
		System.out.println(calcFactorial(4));
	}

	private static int calcFactorial(int number) {
		if (number == 1) {
			return 1;
		}
		return number * calcFactorial(number - 1);
	}

}
