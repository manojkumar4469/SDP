package com.klef.jfsd.springboot.controller;
import java.util.*;
import javax.servlet.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.klef.jfsd.springboot.model.*;
import com.klef.jfsd.springboot.service.*;

@Controller
public class ClientController
{
	@Autowired
	private AdminService adminService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CarService carService;
	
	//--------------------------------------------------------------------------------------------
	
	// Index
	
	@GetMapping("/")
	public ModelAndView mainhomedemo(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	
	// ---------------------------------------------------------------------------------------------
	
	// Login's
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("auname") != null) {
			mv.setViewName("adminhome");
		}
		else {
			mv.setViewName("adminlogin");
		}
		return mv;
	}
	
	@GetMapping("/employeelogin")
	public ModelAndView employeeogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("ename") != null) {
			mv.setViewName("employeehome");
		}
		else {
			mv.setViewName("employeelogin");
		}
		return mv;
	}
	@GetMapping("/customerlogin")
	public ModelAndView customerlogin(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("cname") != null) {
			mv.setViewName("customerhome");
		}
		else {
			mv.setViewName("customerlogin");
		}
		return mv;
	}
	
	@GetMapping("/contactus")
	public ModelAndView contactus() {
		ModelAndView mv=new ModelAndView("contactus");
		return mv;
	}
	
	@GetMapping("/aboutus")
	public ModelAndView aboutus() {
		ModelAndView mv=new ModelAndView("aboutus");
		return mv;
	}
	
	@GetMapping("/addcar")
	public ModelAndView addcar(HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		if(request.getSession().getAttribute("auname") != null) {
			mv.setViewName("addcar");
		}
		else {
			mv.setViewName("adminlogin");
		}
		return mv;
	}
	// -------------------------------------------------------------------------------------------------
	
	// Registration's
	
	@GetMapping("/employeereg")
	public ModelAndView employeeregdemo()
	{
		ModelAndView mv = new ModelAndView("employeeregistration","emp",new Employee());
		return mv;
	}
	
	@GetMapping("/customerreg")
	public ModelAndView customerreg() {
		ModelAndView mv=new ModelAndView("customerregistration","cus",new Customer());
		return mv;
	}
	
//	@GetMapping("/addcar")
//	public ModelAndView addcar() {
//		ModelAndView mv=new ModelAndView("addcar","car",new Car());
//		return mv;
//	}
	
	// ---------------------------------------------------------------------------------------------------
	
	// Home's
	
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("auname")!=null) {
			mv.setViewName("adminhome");
			return mv;
		}
		else {
			mv.setViewName("adminlogin");
		return mv;
		}
	}
	
	@GetMapping("/employeehome")
	public ModelAndView employeehomedemo(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView();
		if(request.getSession().getAttribute("euname")!=null) {
			mv.setViewName("employeehome");
			return mv;
		}
		else {
			mv.setViewName("employeelogin");
			return mv;
		}
	}
	@GetMapping("/customerhome")
	public ModelAndView customerhome(HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		if(request.getSession().getAttribute("cuname")!=null) {
			mv.setViewName("customerhome");
			return mv;
		}
		else {
			mv.setViewName("customerlogin");
			return mv;
		}
	}
	
	// ------------------------------------------------------------------------------------------------------
	
	//View All
	
	@GetMapping("/viewallemps")
	public ModelAndView viewallempsdemo()
	{
		ModelAndView mv = new ModelAndView("viewallemployees");
		
		List<Employee> emplist = adminService.viewallemployees();
		mv.addObject("emplist",emplist);
		
		return mv;
	}
	
	@GetMapping("/viewallcus")
	public ModelAndView viewallcustomers() {
		ModelAndView mv=new ModelAndView("viewallcustomers");
		
		List<Customer> custlist=adminService.viewallcustomers();
		mv.addObject("custlist",custlist);
		
		return mv;
	}
	
	@GetMapping("/viewallcars")
	public ModelAndView viewallcars() {
		ModelAndView mv=new ModelAndView("viewallcars");
		
		List<Car> carlist=adminService.viewallcars();
		mv.addObject("carlist",carlist);
		
		return mv;
	}
	
	// -----------------------------------------------------------------------------------------------------
	
	//Login Check
	
	@PostMapping("/checkadminlogin")
	public String checkadminlogindemo(HttpServletRequest request, HttpSession session)
	{
		ModelAndView mv =  new ModelAndView();
		
		String auname = request.getParameter("auname");
		String apwd = request.getParameter("apwd");
		
		Admin admin = adminService.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{	
			session.setAttribute("auname", auname);
			
			return "redirect:/adminhome";
		}
		else
		{
			mv.addObject("msg", "Login Failed");
			return "redirect:/adminlogin";
		}
	}
	
	
	@PostMapping("/checkemplogin")
	public String checkemplogindemo(HttpServletRequest request, HttpSession session)
	{
		ModelAndView mv =  new ModelAndView();
		
		String euname = request.getParameter("euname");
		String epwd = request.getParameter("epwd");
		
		Employee emp = employeeService.checkemplogin(euname, epwd);
		
		if(emp!=null)
		{	
			session.setAttribute("euname", euname);
			return "redirect:/employeehome";
		}
		else
		{
			mv.addObject("msg", "Login Failed");
			return "redirect:/employeelogin";
		}
	}
	
	@PostMapping("/checkcustomerlogin")
	public String checkcustomerlogin(HttpServletRequest request, HttpSession session) {
		ModelAndView mv=new ModelAndView();
		
		String cuname=request.getParameter("cuname");
		String cpwd=request.getParameter("cpwd");
		
		Customer cus=customerService.checkcustomerlogin(cuname, cpwd);
		
		if(cus!=null) {
			session.setAttribute("cuname", cuname);
			return "redirect:/customerhome";
		}
		else {
			mv.addObject("msg","Login Failed");
			return "redirect:/customerlogin";
		}
	}
	
	// -------------------------------------------------------------------------------------------------------
	
	// Add Data
	
	@PostMapping("/addemployee")
	public String addemployeedemo(@ModelAttribute("emp") Employee employee)
	{
		employeeService.addemployee(employee);		
		return "redirect:employeelogin";
	}
	
	@PostMapping("/addcustomer")
	public String addcustomer(@ModelAttribute("cus") Customer customer) {
		customerService.addcustomer(customer);
		return "redirect:customerlogin";
	}
	
	// -----------------------------------------------------------------------------------------------------
	
	// Delete Data
	
	@GetMapping("/deleteemp")
	public String deleteempdemo(@RequestParam("id") int eid)
	{
		adminService.deleteemployee(eid);
		
		return "redirect:viewallemps";
	}
	
	@GetMapping("/deletecus")
	public String deletecus(@RequestParam("uname") String uname) {
		
		customerService.deleteCusById(uname);
		
		return "redirect:viewallcus";
	}
	
	@GetMapping("/deletecar")
	public String deletecar(@RequestParam("cname") String cname) {
		carService.deleteCarById(cname);
		
		return "redirect:viewallcars";
	}
	
	// -----------------------------------------------------------------------------------------------------
	
	// View Data
	
	@GetMapping("/viewemp")
	public ModelAndView viewemp(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String euname = (String) session.getAttribute("euname");
		
		Employee emp =  employeeService.viewemployee(euname);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewemployee");
		mv.addObject("emp",emp);
		
		return mv;
	}
	
	@GetMapping("/viewcus")
	public ModelAndView viewcus(HttpServletRequest request) {
		HttpSession session=request.getSession();
		
		String cuname=(String) session.getAttribute("cuname");
		Customer cus=customerService.viewcustomer(cuname);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("viewcustomer");
		mv.addObject("cus",cus);
		
		return mv;
	}
	
	// -----------------------------------------------------------------------------------------------------
	
	// Change Password
	
	@GetMapping("/echangepwd")
	public ModelAndView echangepwd(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String euname = (String) session.getAttribute("euname");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empchangepwd");
		mv.addObject("euname",euname);
		
		return mv;
	}
	
	@GetMapping("/cchangepwd")
	public ModelAndView cchangepwd(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String cuname=(String) session.getAttribute("cuname");
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("cuschangepwd");
		mv.addObject("cuname,cuname");
		
		return mv;
	}
	
	// ---------------------------------------------------------------------------------------------------
	
	//Update Password
	
	@PostMapping("/updateemppwd")
	public ModelAndView updateemppwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empchangepwd");
		
		HttpSession session = request.getSession();
		
		String euname = (String) session.getAttribute("euname");
		
		String eoldpwd = request.getParameter("eopwd");
		String enewpwd = request.getParameter("enpwd");
		
		int n = employeeService.changeemployeepassword(eoldpwd, enewpwd, euname);
		
		if(n > 0)
		{
			
			mv.addObject("msg","Password Updated Successfully");
		}
		else
		{
			mv.addObject("msg","Old Password is Incorrect");
		}
		
		return mv;
	}
	
	@PostMapping("/updatecuspwd")
	public ModelAndView updatecuspwd(HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("cuschangepwd");
		
		HttpSession session=request.getSession();
		
		String cuname=(String) session.getAttribute("cuname");
		String coldpwd=request.getParameter("copwd");
		String cnewpwd=request.getParameter("cnpwd");
		
		int n=customerService.changecustomerpassword(coldpwd, cnewpwd, cuname);
		if(n > 0)
		{
			
			mv.addObject("msg","Password Updated Successfully");
		}
		else
		{
			mv.addObject("msg","Old Password is Incorrect");
		}
		
		return mv;
	}
	
	// -------------------------------------------------------------------------------------------------
	
	//View By ID
	
	@GetMapping("/viewempbyid")
	public ModelAndView viewempbyiddemo(@RequestParam("id") int eid)
	{
		Employee emp = adminService.viewemployeebyid(eid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewempbyid");
		mv.addObject("emp",emp);
		
		return mv;
	}
	
	@GetMapping("viewcarbyid")
	public ModelAndView viewcarbyid(@RequestParam("id") int cid) {
		Car car=adminService.viewcarbyid(cid);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("viewcarbyid");
		mv.addObject("car",car);
		
		return mv;
	}
	
	@GetMapping("/viewcusbyid")
	public ModelAndView viewcusbyid(@RequestParam("id") int cid) {
		Customer cus=adminService.viewcustomerbyid(cid);
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("viewcusbyid");
		mv.addObject("cus",cus);
		
		return mv;
	}
	
	//------------------------------------------------------------------------------------------------
	
	//Log Out
	@GetMapping("/logout")
	public String logoutSession(HttpServletRequest request) {
		 request.getSession().invalidate();
		    return "redirect:/";
	}
	
}