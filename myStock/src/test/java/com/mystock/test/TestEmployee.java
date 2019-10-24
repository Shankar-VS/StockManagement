package com.mystock.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestEmployee {
	
	private static Employee employee;
	@BeforeClass
    public static void initEmployeee(){
		employee=new Employee();
		employee.setEmail("test@tt.com");
		employee.setId(101);
		employee.setName("Test");
		employee.setPhone(1233123);
    }
 
    @Test
    public void testEmployee() {
        
        assertEquals("Test",employee.getName());
        assertEquals(1233123,employee.getPhone());
        assertEquals(101,employee.getId());
        assertEquals("test@tt.com",employee.getEmail());
     
    }
    @Test
    public void testNotEmployee() {
        
        assertNotEquals("Testzdf",employee.getName());
        assertNotEquals(123233123,employee.getPhone());
        assertNotEquals(1031,employee.getId());
        assertNotEquals("test1@tt.com",employee.getEmail());
     
    }
   @Test
   public void testGetDiscount()
   {
	   employee.discount=0.2;
	   employee.getDiscount();
   }
}
