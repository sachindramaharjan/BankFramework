package framework;

import framework.interfaces.Controller;
import framework.interfaces.Controllers;
import framework.interfaces.Model;
import framework.interfaces.View;

public final class FrameworkApplication {
	Model m;
	View v;
	Controller accController;
	Controller custController;
	Controller entryController;

	public FrameworkApplication(Model m, View v, Controllers c) {
		this.m = m;
		this.v = v;
		this.accController = c.getAccountController();
		this.custController = c.getCustomerController();
		this.entryController = c.getEntryController();
	}

	public void start() {
		v.showView();
	}
}
