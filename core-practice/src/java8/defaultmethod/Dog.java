package java8.defaultmethod;

public class Dog implements Animal {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat("Grass");
		
		Animal firstAnimal = ()->System.out.println("Lambda First Animal running");
		Animal secondAnimal = ()->System.out.println("Lambda Second Animal running");
		firstAnimal.run();
		secondAnimal.run();
		animal.run();
		
	}

	@Override
	public void run() {
		System.out.println("Animal running");
		
	}

}
