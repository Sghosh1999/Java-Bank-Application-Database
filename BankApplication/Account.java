package BankApplication;

public abstract class Account implements BaseRate{
	
	//List Common Properties for Savings and Checking Account
	private String name;
	private String socialsecurityno;
	double balance;
	protected String accountno;
	static int index = 10260;
	protected double rate;
	
	
	//Constructor to set Base Property and initialize account
	
	public Account(String name,String socialsecurityno,double initDeposit) {
		this.name = name;
		this.socialsecurityno = socialsecurityno;
		balance = initDeposit;
		
		
		//Set Account Number
		index++;
		this.accountno = setAccountNumber();
		setRate();
		
		}
	public abstract void setRate();
	 
	private String setAccountNumber() {
		String lasttwoofssn = socialsecurityno.substring(socialsecurityno.length()-2,socialsecurityno.length());
		int uniqueid = index;
		int randomnumber = (int)(Math.random() * Math.pow(10, 3));
		return lasttwoofssn + uniqueid+randomnumber;
	}
	
	public void compound()
	{
		double accuredinterest = balance * (rate/100);
		balance = balance + accuredinterest;
		System.out.println("Acquried Interest is:"+accuredinterest);
		printBalance();
	}
	
	//Common Methods
	public void deposit(double amount)
	{
		balance = balance+amount; 
		System.out.println("Depositing amount of $"+amount);
		printBalance();
	}
	public void withdraw(double amount)
	{
		balance = balance-amount; 
		System.out.println("Withdrawing amount of $"+amount);
		printBalance();
	}
	public void transfer(String towhere,double amount)
	{
		balance = balance -amount;
		System.out.println("Transfering amount of $"+amount+" "+"to"+towhere);
		printBalance();
	}
	public void printBalance()
	{
		System.out.println("Your Balance is:"+balance);
	}
	public void showinfo()
	{  
		System.out.println("");
		System.out.println("Name:-"+name);
		System.out.println("Social Security No:-"+this.socialsecurityno);
		System.out.println("Balance:-"+balance);
		System.out.println("Account Number:-"+this.accountno);
		System.out.println("Rate : "+rate+"%");
	
	}

}
