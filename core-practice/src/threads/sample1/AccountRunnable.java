package threads.sample1;

public class AccountRunnable implements Runnable {
	Account account = null;

	AccountRunnable(Account account) {
		this.account = account;
	}

	public void run() {

		try {
			while (account.checkBalance()) {
				synchronized (account) {
					Thread.sleep(1000);
					account.withdraw(100);
				}

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
