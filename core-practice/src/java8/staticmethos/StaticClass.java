package java8.staticmethos;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StaticClass {
	
	Lock lock = new ReentrantLock();

	public static void int1() {
		System.out.println("StaticClass.int1()");
	}
	
}
