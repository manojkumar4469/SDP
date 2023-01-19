package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Customer;

public interface CustomerService {
	public Customer checkcustomerlogin(String uname,String pwd);
	public Customer addcustomer(Customer customer);
	public Customer viewcustomer(String uname);
	public int changecustomerpassword(String cusoldpwd,String cusnewpwd,String cuname);
	public Customer deleteCusById(String uname);

}
