package threads.producerconsumer;

public class JobQueue {

	String[] jobQueueArr = new String[10];
	int topIndex = -1;
	private boolean exit;

	public void push(String value) {
		topIndex++;
		jobQueueArr[topIndex] = value;
		System.out.println(value+" is push ");
	}

	public boolean isJobQueueFull() {
		System.out.println(Thread.currentThread().getName()+" checking queue FULL topindex = "+topIndex);
		return topIndex == 9;
	}

	public boolean isJobQueueEmpty() {
		System.out.println(Thread.currentThread().getName()+" checking queue EMPTY topindex = "+topIndex);
		return topIndex == -1;
	}

	public String pop() {
		String value = jobQueueArr[topIndex];
		System.out.println(value +" is popped");
		topIndex--;
		return value;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

}
