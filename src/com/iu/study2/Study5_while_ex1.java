package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		//while문 사용
		//1.로그인 시도, 2.프로그램 종료
		
		boolean check = true;
		
		while(check) {
			System.out.println("1.로그인 시도, 2.프로그램 종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("ID를 입력해주세요.");
				int ID = sc.nextInt();
				System.out.println("PW를 입력해주세요.");
				int PW = sc.nextInt();
			
				if(id==ID && pw==PW) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				break;
			}
		} //while문 끝
		
		//로그인 성공했을때만 진행
		//MMORPG
		//시작레벨:1
		//모든 몬스터의 경험치는 동일
		//최대레벨:15
		//1 -> 2: 3 (사냥성공)
		//2 -> 3: 6 
		//3 -> 4: 9
		//4 -> 5: 12
		//...
		//14 -> 15: 42
		//GOLD: 0
		//5레벨 달성시: 1000GOLD 지급
		//10레벨 달성시: 2000GOLD 지급
		//15레벨 달성시: 3000GOLD 지급
		//레벨업시 게임을 계속할지 종료할지 선택
		//현재레벨, GOLD가 출력
		
	
		int level = 1;
			
		for(level=1; level<15; level++) {
			
			//레벨업시 게임을 계속할지 종료할지 선택
			System.out.println("1.사냥시작, 2.게임종료");
			int select = sc.nextInt();
			if(select != 1) {
				break;
			}
			System.out.println(level+1+ "로 레벨업 했습니다.");
			for(int mon=0; mon<(level - 1)*3; mon++) {
				System.out.println("사냥성공");
			}
	
			if(level==4) {
				int gold = 1000;
				System.out.println(gold+"GOLD 지급");
			}else if(level==9) {
				int gold = 2000;
				System.out.println(gold+"GOLD 지급");
			}else if(level==14){
				int gold = 3000;
				System.out.println(gold+"GOLD 지급");
			}else {
				System.out.println();
			}
		}

		
		System.out.println("프로그램 종료");
		
	}

}
