package edu.mum.cs;

import javax.swing.JTable;

import edu.mum.cs.controller.BankControllers;
import edu.mum.cs.data.AccountService;
import edu.mum.cs.db.dao.factory.AbstractDaoFactory;
import edu.mum.cs.db.dao.factory.MemDaoFactory;
import edu.mum.cs.gui.Bank;
import edu.mum.cs.model.AccountTableModel;
import framework.interfaces.ApplicationManager;
import framework.interfaces.Controllers;
import framework.interfaces.Model;
import framework.interfaces.View;

public class BankAppManager implements ApplicationManager {

	AccountTableModel tableModel;
	JTable table;
	View view;
	Controllers controllers;

	public BankAppManager() {
		table = new JTable();
		AbstractDaoFactory fac = new MemDaoFactory();
		AccountService accService = new AccountService(fac.getAccountDao());
		tableModel = new AccountTableModel(table, accService);
		table.setModel(tableModel);
		controllers = new BankControllers(tableModel);
		view = new Bank(table, controllers);

	}

	public Model getModel() {
		return tableModel;
	}

	@Override
	public View getView() {

		return view;
	}

	@Override
	public Controllers getControllers() {
		return controllers;
	}

}
