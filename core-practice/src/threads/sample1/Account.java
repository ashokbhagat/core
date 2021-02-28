package threads.sample1;

public class Account {

	private int balanceAmt ;
	private int depositedAmount ;

	public int getBalance() {
		return balanceAmt;
	}

	public void withdraw(int withdrawAmt) {
		balanceAmt = balanceAmt - withdrawAmt;
		System.out.println(Thread.currentThread().getName() + " withdrawed : "
				+ withdrawAmt + " balance remaining is :" + balanceAmt);

	}

	public boolean checkBalance() {
		System.out.println(Thread.currentThread().getName()
				+ " checking balance :" + balanceAmt);
		return (balanceAmt > 0);
	}

	public void setDeposite(int depositedAmount) {
		this.depositedAmount = depositedAmount;
		balanceAmt = depositedAmount;
		
	}

}
