package java8.functionalprogram;

public class FunctionalProgrammDemo {
	public static void main(String[] args) {
		// providing definition to calculate method
		Square s = (int x, int y) -> x * y;
		System.out.println(s.calculate(5, 7));

	}

}
