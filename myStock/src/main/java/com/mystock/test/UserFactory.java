/**
 * 
 */
package com.mystock.test;

/**
 * @author Shankar
 *
 */
public class UserFactory {
	protected int year=0;
	
  public User getUser(String userType)
  {
	  if(userType.equalsIgnoreCase("CUSTOMER")){
		  if(year>2){
			  return new Customer(year);
		  }else
		  {
			  return new Customer();
		  }
	  }
	  if(userType.equalsIgnoreCase("EMPLOYEE")){
		  return new Employee();
	  }
	  if(userType.equalsIgnoreCase("AFFILIATE")){
		  return new Affiliate();
	  }
	  return null;
  }
}
