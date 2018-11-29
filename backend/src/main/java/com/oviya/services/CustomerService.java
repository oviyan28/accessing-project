package com.oviya.services;

import com.oviya.model.Customer;
import com.oviya.model.User;

public interface CustomerService {
	void registerCustomer(Customer customer);
	boolean isEmailValid(String email);
	boolean isUsernameValid(String username);
	User getUser(String username);

}
