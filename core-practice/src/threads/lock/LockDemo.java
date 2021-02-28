package threads.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.outer();
		System.out.println("Completed");
	}
}

class Runner {

	ReentrantLock lock = new ReentrantLock();

	public void outer() {
		lock.lock();
		System.out.println("In outer : "+lock.isLocked());
		inner();
		lock.unlock();
		System.out.println("In outer : "+lock.isLocked());
		System.out.println("Done");
	}

	public void inner() {
		System.out.println("In Inner : "+lock.isLocked());
		lock.lock();
		System.out.println("In Inner");
		lock.unlock();
		System.out.println("In Inner : "+lock.isLocked());

	}
}
