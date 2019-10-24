/**
 * 
 */
package com.mystock.test;

/**
 * @author Shankar
 *
 */
public abstract class User extends BaseDetails {
	
 protected double discount; 

  abstract void getDiscount();
  public void billAmount(double amount ) {
	  System.out.println( " Bill Amount :"+amount);
	  double discountAmt= amount* discount;
	  System.out.println(" Discount Amount :"+discountAmt);
	  double amountPayable=amount-discountAmt;
	  System.out.println(" Total Amount Payable :"+amountPayable);
	  
}}
