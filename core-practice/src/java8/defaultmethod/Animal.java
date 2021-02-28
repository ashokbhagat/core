package java8.defaultmethod;

@FunctionalInterface
public interface Animal {

	void run();
	
	public default void eat(String thing) {
		System.out.println("Animal Eating "+thing);
	}
}
