package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Car;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.CarRepository;
import com.klef.jfsd.springboot.repository.CustomerRepository;
import com.klef.jfsd.springboot.repository.EmployeeRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	@Override
	public Admin checkadminlogin(String uname, String pwd) 
	{
		return adminRepository.checkadminlogin(uname, pwd);
	}

	@Override
	public List<Employee> viewallemployees() 
	{
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void deleteemployee(int id)
	{
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee viewemployeebyid(int id)
	{
		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Customer> viewallcustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public List<Car> viewallcars() {
		// TODO Auto-generated method stub
		return (List<Car>) carRepository.findAll();
	}

	@Override
	public void deletecar(int id) {
		// TODO Auto-generated method stub
		carRepository.deleteById(id);
		
	}

	@Override
	public Car viewcarbyid(int id) {
		// TODO Auto-generated method stub
		return carRepository.findById(id).get();
	}

	@Override
	public void deletecustomer(int id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);;
		
	}

	@Override
	public Customer viewcustomerbyid(int id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).get();
	}
}
