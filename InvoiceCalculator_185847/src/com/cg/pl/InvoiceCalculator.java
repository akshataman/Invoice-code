package com.cg.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cg.service.InvoiceService;
import com.cg.service.InvoiceServiceImpl;
import com.cg.service.Validation;


public class InvoiceCalculator {
	
	public static void main(String[] args) {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	InvoiceService service=new InvoiceServiceImpl();
	while(true) {
		System.out.println("==============MENU====================");
        System.out.println("1. Generate Invoice ");
        System.out.println("2. EXIT");
        System.out.println("Enter your choice\n");
        String choice;
		try {
			choice = br.readLine();
			switch (choice) {
			case "1":
				int wt,dst;
				System.out.println("Enter the freight Details: ");
				System.out.println("Enter the weight of the package in KG : ");
				while(true)
				{
				String weight=br.readLine();
				boolean b1 = Validation.validatedata(weight,Validation.weightpattern);
				if(b1 == true)
				{
					try 
					{
						wt = Integer.parseInt(weight);
						break;
					}
					catch(Exception e)
					{
						System.out.println("Enter Again!!!");
					}
				}
				else
				{
					System.out.println("Wrong details Enter Again!!!");
				}
				}
				
				System.out.println("Enter the Distance in KM: ");
				while(true)
				{
				String distance=br.readLine();
				boolean b1 = Validation.validatedata(distance, Validation.distancepattern);
				if(b1 == true)
				{
					try 
					{	
						dst = Integer.parseInt(distance);
						break;
					}
					catch(Exception e)
					{
						System.out.println("Enter Again!!!");
					}
				}
				else
				{
					System.out.println("Wrong input. Enter Valid Distance in numerics only!");
				}
				}
				Product p = service.getProductDetails(p_c);
				if(p != null) {
				p.setQuantity(qty);
				System.out.println("Product Name: "+p.getName());
				System.out.println("Product Category: "+p.getCategory());
				System.out.println("Product Price: "+p.getPrice());
				System.out.println("Quantity: "+p.getQuantity());
				System.out.println("Line Total: "+p.getQuantity()*p.getPrice());
				}
				else
				{
					System.out.println("No item found.Please try again!");
				}
				
				break;
				
			case "2":
					
					System.out.println("Thank You have a nice day!");
				   System.exit(0);
                   break;
                   
            default:
            	  System.out.println("Invalid choice");
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

}
