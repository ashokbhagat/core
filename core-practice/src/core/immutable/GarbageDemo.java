package core.immutable;

public class GarbageDemo {

	public static void main(String[] args) throws InterruptedException {
		Dog dog = new Dog("ashok", 1);
		//dog.clone();
		System.gc();
		//Thread.sleep(100000);

	}
}

final class Dog {
	private String name;
	private int legs;

	Dog(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public int getLegs() {
		return legs;
	}

	public void finalize() {
		System.out.println("Garbage collected ");
	}

}