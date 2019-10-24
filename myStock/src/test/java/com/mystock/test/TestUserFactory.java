/**
 * 
 */
package com.mystock.test;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author Shankar
 *
 */
public class TestUserFactory {
	
	private static UserFactory userFactory;
	@BeforeClass
    public static void initAffiliate(){
		userFactory=new UserFactory();
	}
   @Test
   public void testEmployee(){
	   
	   String userType="Employee"; 
	   Employee employee=(Employee)userFactory.getUser(userType);
	   assertNotNull(employee);
	   employee.setEmail("test@tt.com");
		employee.setId(101);
		employee.setName("Test");
		employee.setPhone(1233123);
		
   }

 @Test
public void testCustomer(){
	   userFactory.year=3;
	   String userType="Customer"; 
	   
	   Customer customer=(Customer)userFactory.getUser(userType);
	   assertNotNull(customer);
	   Customer cust=new Customer(userFactory.year);
	   cust.setEmail("test@tt.com");
	   customer.setEmail("test@tt.com");
	   userFactory.year=1;
	   Customer custYear=new Customer(userFactory.year);
	   assertNotNull(custYear);
}
 @Test
public void testCustomerNullObject(){
	   userFactory.year=3;
	   String userType="Customer11"; 
	   
	   Customer customer=(Customer)userFactory.getUser(userType);
	   assertNull(customer);
	   
}
 @Test
public void testAffiliate(){
	
	   String userType="Affiliate"; 
	  Affiliate affiliate= (Affiliate) userFactory.getUser(userType);
	  assertNotNull(affiliate);
	  affiliate.setId(10001);
	   assertEquals(10001,affiliate.getId());
}
}
