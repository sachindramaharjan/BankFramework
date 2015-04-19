package edu.mum.cs.gui;

import javax.swing.SwingUtilities;

import edu.mum.cs.BankAppManager;
import framework.FrameworkApplication;
import framework.interfaces.ApplicationManager;
import framework.interfaces.Controllers;
import framework.interfaces.Model;
import framework.interfaces.View;

public class Application {

	public Application() {
	}

	public static void main(String[] args) {
		ApplicationManager factory = new BankAppManager();

		Model model = factory.getModel();
		View view = factory.getView();
		Controllers controllers = factory.getControllers();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FrameworkApplication(model, view, controllers).start();
			}
		});
	}
}
