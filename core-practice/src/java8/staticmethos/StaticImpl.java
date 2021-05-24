package java8.staticmethos;

public class StaticImpl extends StaticClass implements StaticInt1, StaticInt2 {
	public static void main(String[] args) {
		StaticInt1 st = new StaticImpl();
		StaticInt1.int1();
	}
}
