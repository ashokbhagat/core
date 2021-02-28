package threads.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {

	BlockingQueue taskQueue;
	List<PoolThread> threadPool;

	public ThreadPool(int threadCount, int taskCount) {
		taskQueue = new ArrayBlockingQueue(taskCount);
		threadPool = new ArrayList<PoolThread>(threadCount);

		for (int i = 0; i < threadCount; i++) {
			threadPool.add(new PoolThread("Thread"+i,taskQueue));
		}

		for (PoolThread thread : threadPool) {
			thread.start();
		}

	}

	public synchronized void execute(Runnable task) {
		this.taskQueue.offer(task);
	}
	

}
