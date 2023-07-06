package com.iu.study4.s2;

public class StudentView {
	
	public void view(Student student) {
		System.out.println(student.getName());
		System.out.println(student.getNum());
		System.out.println(student.getKor());
		System.out.println(student.getEng());
		System.out.println(student.getMath());
		System.out.println(student.getTotal());
		System.out.println(student.getAvg());
		System.out.println("=======================");
	}
	
	public void view(Student[] students) {
		
		for(int i=0; i<students.length; i++) {
			Student student = students[i];
//			System.out.println(students[i].name);
//			System.out.println(students[i].num);
//			System.out.println(students[i].kor);
//			System.out.println(students[i].eng);
//			System.out.println(students[i].math);
//			System.out.println(students[i].total);
//			System.out.println(students[i].avg);
			this.view(student);
			System.out.println("=======================");
		}
	
	}
}
