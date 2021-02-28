package threads.threadpool;

public class ThredPoolDemo {
	public static void main(String[] args) {
		ThreadPool threadPool = new ThreadPool(10, 10);
		threadPool.execute(new Task("task1"));
		threadPool.execute(new Task("task2"));
		threadPool.execute(new Task("task3"));

	}
}

class Task implements Runnable {
	String name = "";

	public Task(String taskname) {
		this.name = taskname;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread() + " : " + this.name);
		}
	}

}
