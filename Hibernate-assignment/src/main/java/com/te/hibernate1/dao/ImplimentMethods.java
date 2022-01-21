package com.te.hibernate1.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernate1.dto.beans.Employee;

public class ImplimentMethods {
	Scanner scanner = new Scanner(System.in);
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit01");
	EntityManager createEntityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = createEntityManager.getTransaction();
	Scanner sc = new Scanner(System.in);
	Employee employee = new Employee();

	public void insertEmployee() {
		System.out.println("Enter the Name and Role");
		String e_name = sc.next();
		String e_role = sc.next();
		System.out.println("----------------------------");

		employee.setE_Name(e_name);
		employee.setE_Role(e_role);
		sc.close();

		System.out.println("----------------------------");
		entityTransaction.begin();
		createEntityManager.persist(employee);
		entityTransaction.commit();
	}

	public void getEmployeeById() {

		System.out.println("Enter the Id");
		int g = sc.nextInt();
		System.out.println("-----------------------------------");

		String query = "from Employee where e_Id=:IDENT ";
		Query query1 = createEntityManager.createQuery(query);
		query1.setParameter("IDENT", g);
		System.out.println("-----------------------------------");
		sc.close();
		List resultList = query1.getResultList();
		for (Object object : resultList) {
			System.out.println(object);
		}
		return;

	}

	public void deleteEmployee() {
		System.out.println("enter the id to delete");
		int id = sc.nextInt();
		System.out.println("-----------------------------------");
		String query = "Delete from Employee where e_Id=:IDENT";
		Query query1 = createEntityManager.createQuery(query);
		query1.setParameter("IDENT", id);
		System.out.println("------------------------------------");
		sc.close();
		entityTransaction.begin();
		int executeUpdate = query1.executeUpdate();
		System.out.println(executeUpdate + " row deleted");
		entityTransaction.commit();
	}
	

}
