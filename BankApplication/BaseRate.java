package BankApplication;

public interface BaseRate {
	
	//Method to return the BAse Rate
	default double getBaseRate()
	{
		return 4.5;
	}

}
