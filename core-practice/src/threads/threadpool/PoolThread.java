package threads.threadpool;

import java.util.concurrent.BlockingQueue;

public class PoolThread extends Thread {

	BlockingQueue taskQueue = null;
	Boolean isStopped = false;

	public PoolThread(String tname, BlockingQueue taskQueue) {
		super(tname);
		this.taskQueue = taskQueue;
	}

	public boolean isStopped() {
		return isStopped;
	}

	public void doStop() {
		isStopped = true;
		this.interrupt();
	}

	public void run() {
		while (!isStopped()) {
			try {
				Runnable runnable = (Runnable) taskQueue.poll();
				runnable.run();
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
	}

}
