package edu.mum.cs.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import edu.mum.cs.data.AccountService;
import framework.interfaces.Model;
import framework.interfaces.account.Account;
import framework.service.IAccountService;

public class AccountTableModel extends AbstractTableModel implements Model {

	List<Account> accounts = new ArrayList<Account>();
	public static List allItems;
	public static List<String> codeList = new ArrayList<>();
	public static List<String> nameList = new ArrayList<>();

	String[] columns = { "AccountNr", "Name", "City", "P/C", "Ch/S", "Amount" };
	private final Class[] columnClass = new Class[] { String.class,
			String.class, Integer.class, Float.class, Float.class };
	JTable table;
	IAccountService service;

	public AccountTableModel(JTable table, AccountService service) {
		this.table = table;
		this.service = service;
		accounts = service.getAll();
		// ItemDao dao = new ItemDao();
		// try {
		// allItems = dao.getAllItems();
		// for (Item item : allItems) {
		// codeList.add(item.getCode());
		// nameList.add(item.getName());
		// }
		// } catch (SQLException e) {
		// allItems = new ArrayList<>();
		// e.printStackTrace();
		// }
	}

	@Override
	public int getRowCount() {

		return accounts.size();
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public String getColumnName(int column) {
		return columns[column];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return columnClass[columnIndex];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 1)
			return true;
		else
			return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Account item = accounts.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return item.getAccNr();
		case 1:
			return item.getCustomer().getName();
		case 2:
			return item.getCustomer().getAddress().getCity();
		case 3:
			return item.getAccountType();
		case 4:
			return item.getBalance();

		default:
			return null;
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// System.out.println(rowIndex);
		// BillItem row = items.get(rowIndex);
		//
		// if (0 == columnIndex) {
		// String newValue = (String) aValue;
		// row.setCode(newValue);
		// int index = codeList.indexOf(newValue);
		// if (index > -1) {
		// row.setName(allItems.get(index).getName());
		// row.setRate(allItems.get(index).getRate());
		// }
		// } else if (1 == columnIndex) {
		// String newValue = (String) aValue;
		// row.setName(newValue);
		// int index = nameList.indexOf(newValue);
		// if (index > -1) {
		// row.setCode(allItems.get(index).getCode());
		// row.setRate(allItems.get(index).getRate());
		// }
		// } else if (2 == columnIndex) {
		// row.setQty((Integer) aValue);
		// Float f = row.getRate() * row.getQty();
		// row.setTotal(Math.round(f*100)/100.0f);
		// } else if (3 == columnIndex) {
		// row.setRate((Float) aValue);
		//
		// } else if (4 == columnIndex) {
		// row.setTotal((Float) aValue);
		// }
		//
		// fireTableDataChanged();
	}

	public void addEmptyItem() {
		// accounts.add(new BankAccount());
		fireTableDataChanged();

	}

	public void removeSelected(int[] selectedRows) {
		if (selectedRows.length > 0) {
			for (int i = selectedRows.length - 1; i >= 0; i--) {
				accounts.remove(selectedRows[i]);
			}
			fireTableDataChanged();
		}

	}

	public void displayItems() {
		// for (BillItem b : items) {
		// System.out.println(b.getQty());
		// }

	}

}
