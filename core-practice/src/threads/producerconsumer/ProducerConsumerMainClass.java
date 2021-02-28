package threads.producerconsumer;

public class ProducerConsumerMainClass {

	public static void main(String[] args) throws InterruptedException {
		JobQueue jobQueue = new JobQueue();
		Thread producerThread = new Thread(new Producer(jobQueue), "PRODUCER");
		Thread consumerThread = new Thread(new Consumer(jobQueue), "CONSUMER");

		producerThread.start();
		consumerThread.start();

		Thread.sleep(1000);

		jobQueue.setExit(true);

	}

}
