package com.te.comparatorAssigignment;

public class Employee {
	int id;
	String name;
	String address;
	double salary;

	public Employee() {

	}

	public Employee(int id, String name, String address, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student[id=" + id + ",name=" + name + ",address=" + address + ",salary=" + salary + "]";
	}

}
