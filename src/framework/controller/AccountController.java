package framework.controller;

import framework.interfaces.Controller;
import framework.interfaces.Event;
import framework.service.IAccountService;

public class AccountController implements Controller {
	IAccountService accService;

	@Override
	public void performAction(Event e) {
		// TODO Auto-generated method stub

	}

	public IAccountService getAccService() {
		return accService;
	}

	public void setAccService(IAccountService accService) {
		this.accService = accService;
	}

}
