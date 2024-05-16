package com.railworld;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employee() {	}
	
	public Employee(int id, String name, String department, int salary){
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee e1) {
		return e1.salary - this.salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
//	Akki,IT,50000
//	Josh,BD,25000
//	Alexa,HR,40000
}
