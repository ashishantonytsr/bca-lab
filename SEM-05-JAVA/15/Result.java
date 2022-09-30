// Total mark & grade of student

import java.util.Scanner;

class Student {
	String name, course, regNo, grade;
	int age, total = 0;

	void readStudentDetails() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter register number : ");
		this.regNo = s.nextLine();
		System.out.println("Enter student name : ");
		this.name = s.nextLine();
		System.out.println("Enter student age : ");
		this.age = Integer.parseInt(s.nextLine());
		System.out.println("Enter course : ");
		this.course = s.nextLine();
	}

	void displayStudentDetails() {
		System.out.println("\nRegister Number : " + this.regNo);
		System.out.println("Student Name : " + this.name);
		System.out.println("Student Age : " + this.age);
		System.out.println("Course : " + this.course);
		System.out.println("Total Marks : " + this.total);
		System.out.println("Student Grade : " + this.grade);
	}
}

public class Result extends Student{

	void markTotalAndPerc() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the mark of five subjects (out of 100) : ");
		for (int i=0; i<5; i++)
			super.total += s.nextInt();

		double perc = super.total / 5;
		super.grade = 
			perc >= 90 ? "A+" : perc >= 80 ? "A" : 
			perc >= 70 ? "B+" : perc >= 60 ? "B" :
			perc >= 50 ? "C+" : perc >= 40 ? "C" :
			perc >= 30 ? "D"  : "E";
	}

	public static void main(String[] args) {
		Result res = new Result();

		res.readStudentDetails();
		res.markTotalAndPerc();
		res.displayStudentDetails();
	}
}
