package java9.privatemethod;

public interface Int1 {
	public default void method2() {
        System.out.println("default method");
    }
	private void method1() {
		System.out.println("Int1.method1()");
	}
}
