/**
 * 
 */
package com.mystock.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Shankar
 *
 */
public class TestUser {

	private static User user;
	@BeforeClass
    public static void initUser(){
		user=new Affiliate();
		user.setEmail("test@tt.com");
		user.setId(101);
		user.setName("Test");
		user.setPhone(1233123);
    }
	 @Test
	    public void testBaseDetails() {
	        
	        assertEquals("Test",user.getName());
	        assertEquals(1233123,user.getPhone());
	        assertEquals(101,user.getId());
	        assertEquals("test@tt.com",user.getEmail());
	     
	    }
	 @Test
	 public void testBillAmount()
	 { 
		 user.discount=0.1;
		 user.billAmount(10.5);
	 }
}
