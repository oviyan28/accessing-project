package com.oviya.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oviya.dao.CustomerDao;
import com.oviya.model.Customer;
import com.oviya.model.User;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	public void registerCustomer(Customer customer) {
		customerDao.registerCustomer(customer);
			// TODO Auto-generated method stub

	}

	public boolean isEmailValid(String email) {
		return customerDao.isEmailValid(email);// TODO Auto-generated method stub
		
	}

	public boolean isUsernameValid(String username) {
		return customerDao.isUsernameValid(username);// TODO Auto-generated method stub
			}

	public User getUser(String username) {
		return customerDao.getUser(username);// TODO Auto-generated method stub
		
	}
}
