package com.chitkara;

public class Employee {

	String empID;
	String empName;
	double salary;

	Address address;

	public static void main(String[] args) {
		Employee emp1 = new Employee();

		System.out.println(emp1); // Employee object address

		System.out.println("Emp ID: " + emp1.empID); // null
		System.out.println("Emp Name: " + emp1.empName); // null
		System.out.println("Salary is: " + emp1.salary); // 0.0
		System.out.println("Address is : " + emp1.address); // null

		Employee emp2 = new Employee();
		emp2.address = new Address();
		emp2.empID = "12345";
		emp2.empName = "abc";
		emp2.salary = 12234.93;
		emp2.address.city = "Ambala Cantt";
		emp2.address.pincode = "34829";
		emp2.address.state = "Haryana";
		System.out.println("Emp ID: " + emp2.empID); // null
		System.out.println("Emp Name: " + emp2.empName); // null
		System.out.println("Salary is: " + emp2.salary); // 0.0
		emp2.address.addr();

	}

}
