package com.iu.study4.s2;

import java.util.Scanner;

public class StudentService {
	
	public Student makeStudentOne() {
		/*
		 * 학생 1명을 만들어서 이름, 번호, 국어, 영어, 수학
		 * 총점 평균을 계산
		 * 학생을 리턴
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("이름을 입력해주세요.");
		student.name = sc.next();
		
		System.out.println("번호를 입력해주세요.");
		student.num = sc.nextInt();
		
		System.out.println("국어점수를 입력해주세요.");
		student.kor = sc.nextInt();
		
		System.out.println("영어점수를 입력해주세요.");
		student.eng = sc.nextInt();
		
		System.out.println("수학점수를 입력해주세요.");
		student.math = sc.nextInt();
		
		student.total = student.kor + student.eng + student.math;
		//System.out.println("총점은 "+student.total+"입니다.");
		
		student.avg = (student.total)/3.0;
		//System.out.println("평균은 "+student.avg+"입니다.");
		
		return student;
	}
	
	public Student[] makeStudents() {
		
		/*
		 * 학생수 입력
		 * 학생수 만큼 학생들이 만들어짐
		 * 이름, 번호, 국어, 영어, 수학점수 입력
		 * 총점, 평균을 계산
		 * 학생들을 리턴
		 * 1. 학생 배열 생성
		 * 2. 학생수 만큼 반복문 실행
		 * 3. 반복문 내에서 이름, 번호, 점수, 국어, 영어, 수학 입력 총점 평균
		 * 4. 해당 학생을 배열에 대입
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생수를 입력해주세요.");
		int count = sc.nextInt();
		
		Student[] students = new Student[count];
		
		for(int i=0; i<count; i++) {
			Student student = new Student();
			
			System.out.println("이름을 입력해주세요.");
			student.name = sc.next();
		
			System.out.println("번호를 입력해주세요.");
			student.num = sc.nextInt();
			
			System.out.println("국어점수를 입력해주세요.");
			student.kor = sc.nextInt();
		
			System.out.println("영어점수를 입력해주세요.");
			student.eng = sc.nextInt();
		
			System.out.println("수학점수를 입력해주세요.");
			student.math = sc.nextInt();
			
			student.total = student.kor + student.eng + student.math;
//		    System.out.println("총점은 "+student.total+"입니다.");
		
		    student.avg = (student.total)/3.0;
//		    System.out.println("평균은 "+student.avg+"입니다.");
		    
		    students[i] = student;
		    
		}
		
		return students;
		
	}
}
