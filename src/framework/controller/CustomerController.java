package framework.controller;

import framework.interfaces.Controller;
import framework.interfaces.Event;
import framework.service.ICustomerService;

public class CustomerController implements Controller {
	ICustomerService custService;

	@Override
	public void performAction(Event e) {
		// TODO Auto-generated method stub

	}

	public ICustomerService getCustService() {
		return custService;
	}

	public void setCustService(ICustomerService custService) {
		this.custService = custService;
	}

}
