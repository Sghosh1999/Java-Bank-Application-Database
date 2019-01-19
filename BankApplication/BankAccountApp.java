package BankApplication;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		List<Account> accounts = new LinkedList<Account>();
		//Initialising the path of the File
		String file = "C:\\Users\\KIIT\\Desktop\\Bank_Application\\NewBankAccounts.csv";
		
		/*
		Checking check1 = new Checking("Sayantan Ghosh","123456789",1500);
		Savings savings1 = new Savings("Arka Roy","123456789",2500);
		check1.showinfo();
		savings1.showinfo();
		savings1.compound();
		
		*/
		
		
		
		//Read a CSV File craeting new accounts base on this
		List<String[]> newCustomers = utilities.CSV.read(file);
		for(String[] Customers:newCustomers) {
			
			String name = Customers[0];
			String socialsecurityno = Customers[1];
			String accountType = Customers[2];
			double initDeposit = Double.parseDouble(Customers[3]);
			System.out.println("Name: "+name);
			System.out.println("Social Security No: "+socialsecurityno);
			System.out.println("Account Type: "+accountType);
			System.out.println("Initial Balance: "+initDeposit);
			
			if(accountType.equals("Savings")) {
				System.out.println("Open a Savings Account:");
				accounts.add(new Savings(name,socialsecurityno,initDeposit));
			}
			else if(accountType.equals("Checking"))
			{
				System.out.println("Open a  Account:");
				accounts.add(new Savings(name,socialsecurityno,initDeposit));
			}
			else {
				System.out.println("Error Reading Account Type:");
			     }
			System.out.println("___________________________________");
		}
		
	//Displaying details of all the account Holder
      for (Account acc : accounts) {
    		acc.showinfo();
      }
     //Depositing Withdrawing Money of any Account Holder
  	accounts.get(5).showinfo(); 
  	accounts.get(5).deposit(1000);
	}
	

}
