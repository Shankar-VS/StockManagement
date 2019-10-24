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
public class TestAffiliate {

	private static Affiliate affiliate;
	@BeforeClass
    public static void initAffiliate(){
		affiliate=new Affiliate();
		affiliate.setEmail("test@tt.com");
		affiliate.setId(101);
		affiliate.setName("Test");
		affiliate.setPhone(1233123);
    }
 
    @Test
    public void testCustomer() {
        
        assertEquals("Test",affiliate.getName());
        assertEquals(1233123,affiliate.getPhone());
        assertEquals(101,affiliate.getId());
        assertEquals("test@tt.com",affiliate.getEmail());
     
    }
    @Test
    public void testNotCustomer() {
        
        assertNotEquals("Testzdf",affiliate.getName());
        assertNotEquals(123233123,affiliate.getPhone());
        assertNotEquals(1031,affiliate.getId());
        assertNotEquals("test1@tt.com",affiliate.getEmail());
     
    }
   @Test
   public void testGetDiscount()
   {
   }

}
