package day33Constructor;

public class Student {
	String name;
	int age;
	String gender;
	int year;
	String course;
	String University;
	
	
	public Student(String name, int age, String gender, int year, String course, String university) {
		
		System.out.println(this.name = name);
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		University = university;
		
		System.out.println("this is Consructor");
	}

}
