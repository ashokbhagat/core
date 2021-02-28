package threads.producerconsumer;

public class Consumer implements Runnable {

	JobQueue jobQueue;

	Consumer(JobQueue jobQueue) {
		this.jobQueue = jobQueue;
	}

	public void run() {
		while (!jobQueue.isExit()) {
			synchronized (jobQueue) {
				try {
					if (jobQueue.isJobQueueEmpty()) {
						jobQueue.wait();
					}
					jobQueue.pop();
					jobQueue.notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
