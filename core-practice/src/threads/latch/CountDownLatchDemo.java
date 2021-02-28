package threads.latch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(10);

		Runnable runnable = new Processor("Processor ", latch, true);
		new Thread(runnable).start();
		latch.await();
		System.out.println("Completed");
		

	}
}

class Processor implements Runnable {
	private CountDownLatch latch;
	private String name;
	private boolean running;

	public Processor(String name, CountDownLatch latch, boolean running) {
		this.latch = latch;
		this.name = name;
		this.running = running;
	}

	@Override
	public void run() {
		int count = 0;
		while (running) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(count++);
			latch.countDown();
		}
	}

}