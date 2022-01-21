package com.te.hibernate1.main.method;

import java.util.Scanner;

import com.te.hibernate1.dao.ImplimentMethods;

public class MainMethod {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("ENTER THE CHOICE!");
		System.out.println("hibernate");
		System.out.println("1.inserting Data");
		System.out.println("2.get the Data");
		System.out.println("3.deleting the row");
		int x = sc1.nextInt();
		switch (x) {
		case 1:

			System.out.println("1.inserting in in the table");
			ImplimentMethods implimentMethods = new ImplimentMethods();
			implimentMethods.insertEmployee();

			break;

		case 2:
			System.out.println("2.getting the details");
			ImplimentMethods implimentMethods2 = new ImplimentMethods();
			implimentMethods2.getEmployeeById();

			break;

		case 3:
			System.out.println("3.deleting the row");
			ImplimentMethods implimentMethods3 = new ImplimentMethods();
			implimentMethods3.deleteEmployee();
		default:
			System.out.println("INVALID CHOICE");

		}

	}
}
