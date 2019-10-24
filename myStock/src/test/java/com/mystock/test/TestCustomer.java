package com.mystock.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCustomer {
	
	private static Customer customer;
	@BeforeClass
    public static void initCustomere(){
		customer=new Customer();
		customer.setEmail("test@tt.com");
		customer.setId(101);
		customer.setName("Test");
		customer.setPhone(1233123);
    }
 
    @Test
    public void testCustomer() {
        
        assertEquals("Test",customer.getName());
        assertEquals(1233123,customer.getPhone());
        assertEquals(101,customer.getId());
        assertEquals("test@tt.com",customer.getEmail());
     
    }
    @Test
    public void testNotCustomer() {
        
        assertNotEquals("Testzdf",customer.getName());
        assertNotEquals(123233123,customer.getPhone());
        assertNotEquals(1031,customer.getId());
        assertNotEquals("test1@tt.com",customer.getEmail());
     
    }
   @Test
   public void testGetDiscount()
   {
   }

}
