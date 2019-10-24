package com.mystock.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class StockManagement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserFactory userFactory= new UserFactory();	
		try {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));        
		String name,email,userType=null;
		int id,phone;			
			    System.out.println(" Select user type:");
			    System.out.println(" Employee");
			    System.out.println(" Customer");
			    System.out.println(" Affiliated");
				System.out.println(" Enter user Type above mentioned:");
				
				userType=br.readLine();
				if(userType!=null && (!userType.isEmpty())){
				{
					if(userType.equalsIgnoreCase("Customer")){
					System.out.println("Enter number of years :");
					userFactory.year=Integer.parseInt(br.readLine());					
					}
				System.out.println("Enter Id :");			
				id=Integer.parseInt(br.readLine());
				System.out.println("Enter Name :");
				name=br.readLine();
				System.out.println();
				System.out.println("Enter Email  :");
				email=br.readLine();
				System.out.println("Enter Phone :");			
				phone=Integer.parseInt(br.readLine());	
				System.out.println(" Enter Bill Amount :");
				double amount=Double.parseDouble(br.readLine());
				User user=userFactory.getUser(userType);						
				user.setId(id);
				user.setName(name);
				user.setEmail(email);
				user.setPhone(phone);
				user.getDiscount();
				System.out.println(" VS Stock System");
				System.out.println(" Bill date :"+new Date());
				System.out.println(" User Id  :"+user.getId());
				System.out.println(" User Name:"+user.getName());
				System.out.println(" Email Id :"+user.getEmail());
				System.out.println(" Phone    :"+user.getPhone());
				user.billAmount(amount);
				}}else
				{
					System.out.println(" Re-Enter user type :" );
				}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
