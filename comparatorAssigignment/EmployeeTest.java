package com.te.comparatorAssigignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(39, "Praveen", "blr", 300000.0));
		list.add(new Employee(34, "shrushti", "chennai", 500000.91));
		list.add(new Employee(33, "Anu", "delhi", 40000.87));
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				" 1.Before sorting \n 2.Sort by Id \n 3.Sort by Name \n 4.sort by Address \n 5.sort by Salary");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Before Sorting ");
			// Collections.sort(list, new Employee());
			for (Employee employee : list) {
				System.out.println(employee);
			}
			break;
		case 2:
			System.out.println("Sort By id");
			Collections.sort(list, new SortById());
			for (Employee employee : list) {
				System.out.println(employee);
			}
			break;
		case 3:
			System.out.println("Sort By Name");
			Collections.sort(list, new SortByName());
			for (Employee employee : list) {
				System.out.println(employee);
			}
			break;
		case 4:
			System.out.println("Sort By Address");
			Collections.sort(list, new SortByAddress());
			for (Employee employee : list) {
				System.out.println(employee);
			}
			break;
		case 5:
			System.out.println("Sort By salary");
			Collections.sort(list, new SortBySalary());
			for (Employee employee : list) {
				System.out.println(employee);
			}
			break;

		default:
			System.out.println("===invalid choice===");
			System.out.println("==please choose 1 to 5 choices==");
			System.exit(0);
		}
		scanner.close();

	}
}
