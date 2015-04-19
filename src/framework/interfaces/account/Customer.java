package framework.interfaces.account;

import framework.interfaces.party.Address;
import framework.interfaces.party.Party;

public abstract class Customer implements Party {
	Address address;
	String name;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
