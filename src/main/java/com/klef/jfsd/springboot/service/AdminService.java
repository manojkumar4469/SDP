package com.klef.jfsd.springboot.service;
import java.util.List;
import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Car;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Employee;
public interface AdminService
{
	public Admin checkadminlogin(String uname,String pwd);
	//For Employee
	public List<Employee> viewallemployees();
	public void deleteemployee(int id);
	public Employee viewemployeebyid(int id);
	//For Customer
	public List<Customer> viewallcustomers();
	
	public void deletecustomer(int id);
	public Customer viewcustomerbyid(int id);
	//For Car
	public List<Car> viewallcars();
	public void deletecar(int id);
	public Car viewcarbyid(int id);
	
}
