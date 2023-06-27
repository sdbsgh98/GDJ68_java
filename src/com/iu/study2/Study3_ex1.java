package com.iu.study2;

import java.util.Scanner;

public class Study3_ex1 {

	public static void main(String[] args) {
		//국어, 영어 , 수학 입력
		//총점, 평균계산(평균은 int)
		//90:A, 80:B, 70:C, 60:D, 그외:F
		//switch case문 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요.");
		int korea = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		int english = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		int math = sc.nextInt();
		
		int total = korea + english + math;
		int avg = total/3;
		
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}

}
