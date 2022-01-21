package com.te.javasbasic.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(100, "Praveen", 3133.44));
		employees.add(new Employee(400, "raveen", 333.44));
		employees.add(new Employee(200, "aveen", 33.44));
		employees.add(new Employee(300, "veen", 3.44));
		
		
		System.out.println("ArrayList Without Sorting");
		System.out.println(employees);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
			
			System.out.println("After Sorting");
			Collections.sort(employees);
			for (Employee employees31 : employees) {
				System.out.println(employees31);
			}
			
			
			
			
			
			
			
			
			
		}
	}
	


