/**
 * 
 */
package com.mystock.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Shankar
 *
 */
public class TestBaseDetails {
	private static BaseDetails baseDetails;
	@BeforeClass
    public static void initBaseDetails(){
		baseDetails=new Affiliate();
		baseDetails.setEmail("test@tt.com");
		baseDetails.setId(101);
		baseDetails.setName("Test");
		baseDetails.setPhone(1233123);
    }
	 @Test
	    public void testBaseDetails() {
	        
	        assertEquals("Test",baseDetails.getName());
	        assertEquals(1233123,baseDetails.getPhone());
	        assertEquals(101,baseDetails.getId());
	        assertEquals("test@tt.com",baseDetails.getEmail());
	     
	    }
	    @Test
	    public void testNotCustomer() {
	        
	        assertNotEquals("Testzdf",baseDetails.getName());
	        assertNotEquals(123233123,baseDetails.getPhone());
	        assertNotEquals(1031,baseDetails.getId());
	        assertNotEquals("test1@tt.com",baseDetails.getEmail());
	     
	    }
	
 
}
