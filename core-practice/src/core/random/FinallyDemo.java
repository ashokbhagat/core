package core.random;

import core.random2.AccessModifierDemo;

public class FinallyDemo extends AccessModifierDemo {

	public static void main(String[] args) {

		FinallyDemo demo = new FinallyDemo();
		System.out.println("ABCD".compareTo("DB"));

	}

}

class Another extends FinallyDemo{
	public static void main(String[] args) {
		
		
		Another another = new Another();
	}
}

class MyException extends Exception{
	
}
