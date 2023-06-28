package com.iu.study2;

import java.util.Scanner;

public class Study4_for_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean loginResult = false;
		
		//로그인 시도는 최대 5번까지 가능.
		for(int i=0; i<5; i++) {		
			System.out.println("ID를 입력하세요.");
			int ID = sc.nextInt();
			System.out.println("PW를 입력하세요.");
			int PW = sc.nextInt();
			
			if(id==ID && pw==PW) {
				System.out.println("로그인 성공");
				loginResult =! loginResult;
				break;
			}else {
				System.out.println("ID 또는 PW가 틀렸습니다.");
			}
		}
		
		//로그인 성공시 급여계산 출력
		if(loginResult) {
			System.out.println("급여 계산");
		}
		
		System.out.println("프로그램 종료");
	}

}
