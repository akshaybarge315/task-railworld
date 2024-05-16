package com.railworld;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ComparatorSortingName {
	
	public static void main(String args[]) {
		MyCompare1 compare1 = new MyCompare1();
		TreeSet<Employee> list = new TreeSet<Employee>(compare1);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {

			String s = sc.next();
			String arr[] = s.split(",");
			
			int id = 1000+i;
			String name = arr[0];
			String dept = arr[1];
			int sal = Integer.parseInt(arr[2]);
			
			Employee emp = new Employee(id, name, dept, sal);
			list.add(emp);
		}
		
		for(Employee emp : list ) {
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getDepartment() + " " + emp.getSalary());
		}
	}
}

class MyCompare1 implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();
		
		int l1 = name1.length();
		int l2 = name2.length();
		
		if(l1 != l2) {
			return l1-l2;
		}else {
			return e1.getId() - e2.getId();
		}
	}
	
}

