package com.iu.study4;

public class StudyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

//		Card card = new Card();
//		Card card2 = new Card();
//		
//		System.out.println(card.cvc); 
//		System.out.println(card.name);
//		
		Student s1 = new Student();
		s1.name="winter";
		s1.gender='F';
		
		Student s2 = new Student();
		s2.name = "iu";
		s2.gender = 'F';
		
		//출력
		StudentView sv = new StudentView();
		sv.view(s1);
		
		Student[] students = new Student[2];
		students[0] = s1;
		students[1] = s2;
		sv.viewAll(students);
		
//		Student s2 = new Student();
//		s2.name = "iu";
//		
//		Student[] students = new Student[3];
//		students[0] = s1;
//		students[1] = s2;
//		
//		System.out.println(students[2].name);
//		
//		for(int i=0; i<students.length; i++) {
//			System.out.println(students[i].name);
//			System.out.println(students[i].id);
//		}
//		
//		Student s3 = new Student();
//		s3.name = "iu";
		
//	
//		s2 = s1;
//		
//		System.out.println(s2.name);
		
		System.out.println("프로그램 종료");
	}

}
