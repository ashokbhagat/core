package threads.sample1;

public class ThreadOriginator {
	
	public static void main(String[] args) {
		
		Account account = new Account();
		account.setDeposite(1000);
		
		Thread husband = new Thread(new AccountRunnable(account) , "husband");
		Thread wife = new Thread(new AccountRunnable(account) , "wife");
		
		
		
		husband.start();
		wife.start();

	}

}
