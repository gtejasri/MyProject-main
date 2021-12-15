package com.cg.dms.service.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.dms.entities.Customer;
import com.cg.dms.exception.CustomerNotFoundException;
import com.cg.dms.repository.ICustomerRepository;
import com.cg.dms.service.ICustomerService;

@SpringBootTest
public class CustomerServiceTest {
	@Autowired
	ICustomerService customerService;
	
	@MockBean
	ICustomerRepository customerRepository;
	
	@Test
	void testInsertCustomer() {
	Customer c1 = new Customer();
	c1.setUsername("Tejasri");
	c1.setFirstName("Teja");
    c1.setLastName("sri");
	c1.setPassword("root");
	c1.setMobileNumber("8186835638");
	c1.setEmail("teja@123");
	c1.setMilkunits(20);
	c1.setUnitprice(30);
	c1.setCustomerId(1);
	
	Mockito.when(customerRepository.save(c1)).thenReturn(c1);
		
		assertThat(customerService.insertCustomer(c1)).isEqualTo(c1);
	}
	

	
	@Test
	void testUpdateCustomer()  throws CustomerNotFoundException{
		
		Customer c1=new Customer();
		
		c1.setFirstName("Teja");
	    c1.setLastName("Sai");
		c1.setPassword("12345");
		c1.setMobileNumber("4561237890");
		c1.setEmail("abc@gmail");
		c1.setMilkunits(20);
		c1.setUnitprice(30);
		c1.setCustomerId(1);
		
		
Mockito.when(customerRepository.save(c1)).thenReturn(c1);
		
try {
 	assertEquals(c1,customerService.updateCustomer(c1) );
 	} catch
      (   CustomerNotFoundException e) {
 	e.printStackTrace();
 	}
	}
//	"firstName": "Teja",
//	  "lastName": "Sai",
//	  "password": "12345",
//	  "mobileNumber": "4561237890",
//	  "email": "SaiTeja@gmail.com",
//	  "milkunits": 20,
//	  "unitprice": 15,
//	  "customerId": 1,
//	  "username": "tejacustomer"
//	@Test
// 	public void viewCustomerTest() throws CustomerNotFoundException {
//		Customer c1=new Customer();
//		c1.setUsername("swathi");
//		c1.setFirstName("sonnu");
//	    c1.setLastName("monu");
//		c1.setPassword("asdf@2123");
//		c1.setMobileNumber(81868687);
//		c1.setEmail("as@123");
//		c1.setMilkunits(20);
//		c1.setUnitprice(30);
//		c1.setCustomerId(1);
//		
//		
//		when(customerRepository.findAll()).thenReturn(customerId);
//	 	assertEquals(customers, customerService.viewCustomers());

		
	//}
// 		@Test
// 		void testviewCustomer()  {
//		
//		Customer c1=new Customer();
//		c1.setUsername("swathi");
//		c1.setFirstName("sonnu");
//	    c1.setLastName("monu");
//		c1.setPassword("asdf@2123");
//		c1.setMobileNumber("81868687");
//		c1.setEmail("as@123");
//		c1.setMilkunits(20);
//		c1.setUnitprice(30);
//		c1.setCustomerId(1);
//		
//		
//Mockito.when(customerRepository.save(c1)).thenReturn(c1);
//		
//try {
// 	assertEquals(c1,customerService.viewCustomer(1));
// 	} catch
//      (   CustomerNotFoundException e) {
// 	e.printStackTrace();
// 	}
//	}
 		@Test
 		void testdeleteCustomer() {
 			Customer c1 = new Customer();
 			c1.setUsername("swathi");
 			c1.setFirstName("santhi");
 		    c1.setLastName("asdf");
 			c1.setPassword("asdf2123");
 			c1.setMobileNumber("7899923645");
 			c1.setEmail("as@123");
 			c1.setMilkunits(20);
 			c1.setUnitprice(30);
 			c1.setCustomerId(1);
 			
 			Mockito.when(customerRepository.save(c1)).thenReturn(c1);
            try {
				assertThat(customerService.deleteCustomer(3)).isEqualTo(c1);
			} catch (CustomerNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 			}
}







































//package com.cg.dms.service.tests;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.ApplicationContext;
//
//import com.cg.dms.entities.Customer;
//import com.cg.dms.exception.CustomerNotFoundException;
//import com.cg.dms.repository.ICustomerRepository;
//import com.cg.dms.service.CustomerService;
//
//@SpringBootTest
//public class CustomerServiceTest{
//@Autowired
//private CustomerService Service;
//@MockBean
//private ICustomerRepository customerRepository;
//@MockBean
//private Customer customer;
//@Autowired
//private ApplicationContext context;
//@Test
//
//public void testToviewCustomers() throws CustomerNotFoundException {
//	int source = Service.viewCustomers().size();
//	int count = 0;
//	Customer expected = context.getBean(Customer.class);
//	List<Customer> list = new ArrayList<Customer>();
//	for (int i = 0; i < source; i++) {
//		list.add(expected);
//		count += 1;
//	}
//	List<Customer> actual = Service.viewCustomers();
//	assertEquals(count, actual.size());
//}
//
//
//}
//
