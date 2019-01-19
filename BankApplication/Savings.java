package BankApplication;

public class Savings extends Account{
	
	//List Properties of the Savings Account
	private int safetydepositboxID;
	private int safetydepositboxKey;
	
	
	//Constructor to Initialize Savings Account Properties
	public Savings(String name,String socialsecurityno,double initDeposit)
	{
		super(name,socialsecurityno,initDeposit);
		accountno = '1'+ accountno;
		setSafetyDepositBox();
		
	}
	public void setRate() {
		rate = getBaseRate()- 0.25;
	}
	 private void setSafetyDepositBox() {
		 safetydepositboxID = (int) (Math.random()*Math.pow(10, 3));
		 safetydepositboxKey = (int)(Math.random()*Math.pow(10, 4));
	 }
	
	
	//List Methods related to savings account
	 public void showinfo()
	 { 
		 
		super.showinfo();
		System.out.println("Account Type: Savings");
		System.out.println("Your Features");
		System.out.println("Safety Deposit Box ID:-"+safetydepositboxID);
		System.out.println("Safety Deposit Box Key:-"+safetydepositboxKey);
		System.out.println("----------------------");
		
	 }
	

}
