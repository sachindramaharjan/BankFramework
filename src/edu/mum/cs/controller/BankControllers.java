package edu.mum.cs.controller;

import framework.interfaces.Controllers;
import framework.interfaces.Model;

public class BankControllers extends Controllers {
	Model model;

	public BankControllers(Model model) {
		this.model = model;
		//setAccountController(new AccountController());
	}

}
