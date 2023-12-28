package com.store.project;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStore {
	Scanner scan =new Scanner(System.in);

	// map is a data base and Integer -->keys and values--> product[name, quantity,cost]

	Map<Integer,Product> db= new LinkedHashMap<Integer,Product>();

	int totalBill=0;

	void addProduct()
	{
		db.put(1, new Product("ICECREAM",10,100));
		db.put(2, new Product("DARK ICECREAM",5,500));
		db.put(3, new Product("DARK BISCUITS",8,450));
	}
	void displayProduct()
	{

		Set<Integer>keys=db.keySet();  // 1  2 3
		for(int key :keys){
			Product p=db.get(key);  //getting the product based on key

			System.out.println("ENTER "+key+" to Order"+p.getName());
			System.out.println("Available Quantity :"+p.getQuantity());
			System.out.println("Cost : Rs."+p.getCost());
			System.out.println("-------------------------");
		}

	}
	void buyProduct()
	{

		System.out.println("Enter Choice :");    // choice---> key
		int choice =scan.nextInt();

		Product p=db.get(choice);   // product p = chocolate object;

		if(p!=null)
		{
			System.out.println("Enter Quantity:");  
			int quantity=scan.nextInt();        //2

			if(quantity<=p.getQuantity()) {

				// 1.Calculating current product cost
				int productCost = quantity*p.getCost();

				// 2.Updating new quantity
				p.setQuantity(p.getQuantity()-quantity);

				// 3.adding current product cost to the  total bill
				totalBill = totalBill+productCost;



				System.out.println("Purchased "+quantity+" "+p.getName());
				System.out.println("Current Product Cost is Rs."+productCost);
				System.out.println("Total Bill as of Now : Rs."+totalBill);
			}
			else
			{
				System.out.println("INSUFFICIENT QUMATITY");
				System.out.println("Available Quantity is"+p.getQuantity());
			}
		}
		else
		{
			System.out.println("Invaild Choice, Kindly Enter Valid Choice");
		}

	}

	void checkout()
	{
		System.out.println(" THANKS YOU FOR SHOPPING *-* ");
		System.out.println(" YOUR TOTAL BILL IS RS."+totalBill);

	} 



}
