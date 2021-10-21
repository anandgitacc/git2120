package org.testone;

public class Employee {
	
	public void empId() {
		System.out.println("Id : 123");
	}
	
	public void empName() {
		System.out.println("Name : Anand");
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.empId();
		e.empName();
	}

}
