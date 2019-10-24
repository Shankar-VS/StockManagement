/**                                                                                                         
 *                                                                                                          
 */                                                                                                         
package com.mystock.test;                                                                                     
                                                                                                            
/**                                                                                                         
 * @author Shankar                                                                                          
 *                                                                                                          
 */                                                                                                         
public class Customer extends User{                                                                         
  private int year;	                                                                                        
	                                                                                                       
  public Customer(){                                                                                      
	} 
   /**                                                                                                     
	 * @param year                                                                                          
	 */                                              
	public Customer(int year) {                                                                             
		super();                                                                                            
		this.year = year;                                                                                   
	}                                                                                                       
                                                                                                            
	/**                                                                                                     
	 * @return the year                                                                                     
	 */                                                                                                     
	public int getYear() {                                                                                  
		return year;                                                                                        
	}                                                                                                       
                                                                                                            
	/**                                                                                                     
	 * @param year the year to set                                                                          
	 */                                                                                                     
	public void setYear(int year) {                                                                         
		this.year = year;                                                                                   
	}                                                                                                   
	@Override                                                                                               
	public void getDiscount() {                                      
		if(year>2){                                                   
		discount= 0.1;
     }	else{   
			discount=1.0;                            
		}                                          
	}                                                                                                       
	                                                                                             
                                                                                                     
                                                                                                        
}                                                                                                           










