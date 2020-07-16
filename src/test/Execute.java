package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	String name;
	int grade;
	int point;
	public Student(String name, int grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	@Override
	public int compareTo(Student o) {
		return o.grade-this.grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", point=" + point + "]";
	}
	
}
public class Execute {
	public static void main(String[] args) {
		List<Student> intList = new ArrayList<>();
		intList.add(new Student("동혁",3,90));
		intList.add(new Student("인혁",1,70));
		Collections.sort(intList);
		System.out.println(intList);
	}
}
