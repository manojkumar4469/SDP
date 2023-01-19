package com.klef.jfsd.springboot.repository;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.klef.jfsd.springboot.model.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	@Query("select c from Customer c where username=?1 and password=?2")
	public Customer checkcustomerlogin(String uname, String pwd);
	
	@Query("select c from Customer c where username=?1")
	public Customer viewcustomer(String uname);
	
	@Query("DELETE FROM Customer c where username=?1")
	public Customer deleteCusById(String uname);
	
	@Transactional
	@Modifying
	@Query("update Customer c set c.password=?1 where c.password=?2 and c.username=?3")
	public int updatecuspassword(String cusnewpwd,String cusoldpwd,String cusuname);

}