package framework.interfaces.account;

public interface IAccount {
	Double getBalance();

	void addEntry(Entry ent);

	int getAccountType();

	Integer getAccNr();
	
	String getName();
	
	Customer getCustomer();
	
	
	
	
	


}
