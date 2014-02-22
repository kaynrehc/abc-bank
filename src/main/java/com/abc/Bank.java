package com.abc;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Customer> customers;

	public Bank() {
		customers = new ArrayList<>();
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public double totalInterestPaid() {
		double total = 0;
		for (Customer c : customers)
			total += c.totalInterestEarned();
		return total;
	}

}
