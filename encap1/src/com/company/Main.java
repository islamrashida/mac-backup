package com.company;

public class Main {

	public static void main(String[] args) {
		employee e = new employee();
		e.setID(6);
		e.setName("Rashida");
		e.setSalary(80000);
		System.out.println("Name :" +e.getName());
		System.out.println("ID :" +e.getID());
		System.out.println("Salary :" +e.getSalary());
		

	}

}
