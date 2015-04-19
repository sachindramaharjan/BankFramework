package framework.interfaces;

public class Controllers {
	Controller accountController;
	Controller entryController;
	Controller customerController;

	public Controller getAccountController() {
		return accountController;
	}

	public void setAccountController(Controller accountController) {
		this.accountController = accountController;
	}

	public Controller getEntryController() {
		return entryController;
	}

	public void setEntryController(Controller entryController) {
		this.entryController = entryController;
	}

	public Controller getCustomerController() {
		return customerController;
	}

	public void setCustomerController(Controller customerController) {
		this.customerController = customerController;
	}

}
