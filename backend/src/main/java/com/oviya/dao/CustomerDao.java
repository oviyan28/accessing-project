package com.oviya.dao;

import com.oviya.model.Customer;
import com.oviya.model.User;

public interface CustomerDao {
	void registerCustomer(Customer customer);
	boolean isEmailValid(String email);
	boolean isUsernameValid(String username);
	User getUser(String username);
}
