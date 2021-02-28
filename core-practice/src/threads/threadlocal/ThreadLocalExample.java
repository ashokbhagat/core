package threads.threadlocal;

public class ThreadLocalExample {

	public static class MyRunnable implements Runnable {

		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
		Integer i=0;

		@Override
		public void run() {
			threadLocal.set((int) (Math.random() * 100D));
			try {
				Thread.sleep(5000);
			//i =(int) (Math.random() * 100D);
			System.out.println(threadLocal.get());
				
			} catch (InterruptedException e) {
			}

			
		}
	}

	public static void main(String[] args) {
		MyRunnable sharedRunnableInstance = new MyRunnable();

		Thread thread1 = new Thread(sharedRunnableInstance);
		Thread thread2 = new Thread(sharedRunnableInstance);

		thread1.start();
		thread2.start();
	}

}