package threads.producerconsumer;

public class Producer implements Runnable {
	JobQueue jobQueue;

	public Producer(JobQueue jobQueue) {
		this.jobQueue = jobQueue;
	}

	public void run() {
		while (!jobQueue.isExit()) {
			synchronized (jobQueue) { 
				try {
					if (jobQueue.isJobQueueFull()) {
						jobQueue.wait();
					}
					jobQueue.push("ashok");
					jobQueue.notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
