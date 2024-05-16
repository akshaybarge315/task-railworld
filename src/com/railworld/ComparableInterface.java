package com.railworld;

class Student implements Comparable<Student>{
	String name;
	int marks;
	
	public Student() {}

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student s) {
		if(s.marks < this.marks) {
			return 0;
		}
		else if(s.marks > this.marks) {
			return 1;
		}
		return -1;
	}
}

public class ComparableInterface {

	public static void main(String[] args) {
		Student s1 = new Student("abc", 10);
		Student s2 = new Student("xyz", 20);
		
		if(s1.compareTo(s2) == 0) {
			System.out.println(s2.name + " having High Less");
		}else if(s1.compareTo(s2) == 1) {
			System.out.println(s2.name + " having High marks");
		}else {
			System.out.println("Both having equal Marks");
		}
	}

}
