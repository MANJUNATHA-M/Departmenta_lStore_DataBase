package com.store.project;

import java.util.Scanner;

public class ProductSolution {

	public static void main(String[] args) {

		System.out.println(" Welcome to CRAZY Departmental Store");
		System.out.println("-------------------------------------");


		Scanner scan=new Scanner(System.in);

		DepartmentalStore store= new DepartmentalStore();
		store.addProduct();  // 1. adding product into database

		int choice=1;

		while(choice==1)
		{
			store.displayProduct();    // 2.displaying the products from database
			store.buyProduct();       // 3. buying the products

			System.out.println("Enter 1 to Continue Or Any Other Number to CheckOut / Billing section");
			choice=scan.nextInt();   //10
			System.out.println("---------------------------------");


		}
		store.checkout();

	}

}
