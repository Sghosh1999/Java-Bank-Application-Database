package BankApplication;

public class Checking extends Account {
	
	//List Properties specific to Checking Account
	private int debitcardno;
	private int debitcardpin;
	
	
	//Constructor to initialize Checking account Properties
	public Checking(String name,String socialsecurityno,double initDeposit)
	
	{   
		 super(name,socialsecurityno,initDeposit);
		 accountno = "2"+ accountno;
		 setDebitCard();
	}	 
	public void setRate() {
		rate = getBaseRate()+ 0.15;
	}
	
	//List any Methods specific to Checking Account
	     private void setDebitCard() {
	    	 debitcardno = (int)(Math.random()*Math.pow(10, 12));
	    	 debitcardpin = (int)(Math.random()*Math.pow(10, 4));
	     }
	
		 public void showinfo()
		 { 
			super.showinfo();
			System.out.println("Account Type: Checking");
			System.out.println("Debit Card No:"+debitcardno);
			System.out.println("Pin No:-"+debitcardpin);
			System.out.println("Account Type: Checking"); 
			System.out.println("----------------------");
			
		 }
		
	
	
	

}
