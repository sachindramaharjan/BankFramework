package edu.mum.cs.gui;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import framework.interfaces.Controller;
import framework.interfaces.Controllers;
import framework.interfaces.View;

public class Bank extends JFrame implements View {

	private BankingPanel bankPanel;
	private JTable table;
	JButton perAC;
	JButton compAC;
	JButton deposit;
	JButton withdraw;
	JButton addInterest;
	JButton exit;

	public Bank(JTable table, Controllers controllers) {

		super("Banking System");
		this.table = table;
		init();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// getContentPane().add(panel);
		// pack();

	}

	private void init() {
		setTitle("Bank Application.");
		getContentPane().setLayout(new BorderLayout(0, 0));
		setSize(575, 310);
		// bankPanel = new BankingPanel();
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		perAC = new JButton("Add personal account");
		panel1.add(perAC);

		compAC = new JButton("Add company account");
		panel1.add(compAC);

		addInterest = new JButton("Add interest");
		panel1.add(addInterest);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		deposit = new JButton("Deposit");

		panel2.add(deposit);
		panel2.add(Box.createHorizontalStrut(1));
		withdraw = new JButton("Withdraw");
		panel2.add(withdraw);
		panel2.add(Box.createHorizontalStrut(1));
		exit = new JButton("Exit");
		panel2.add(exit);
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, new JScrollPane(table));
		c.add(BorderLayout.NORTH, panel1);
		c.add(BorderLayout.EAST, panel2);

	}

	@Override
	public void showView() {
		setVisible(true);

	}
}
