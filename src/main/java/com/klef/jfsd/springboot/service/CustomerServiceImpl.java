package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer checkcustomerlogin(String uname, String pwd) {
		// TODO Auto-generated method stub
		return customerRepository.checkcustomerlogin(uname, pwd);
	}

	@Override
	public Customer addcustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer viewcustomer(String uname) {
		// TODO Auto-generated method stub
		return customerRepository.viewcustomer(uname);
	}

	@Override
	public int changecustomerpassword(String cusoldpwd, String cusnewpwd, String cuname) {
		// TODO Auto-generated method stub
		return customerRepository.updatecuspassword(cusnewpwd, cusoldpwd, cuname);
	}

	@Override
	public Customer deleteCusById(String uname) {
		// TODO Auto-generated method stub
		return customerRepository.deleteCusById(uname);
	}

}
