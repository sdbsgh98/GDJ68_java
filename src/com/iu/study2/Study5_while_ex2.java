package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		
		//TRPG
		int userHp = 40; //유저의 HP
		int monsterHp = 60; //몬스터의 HP
		int monsterAttack = 40; //몬스터의 공격력
		
		//유저정보:HP, 몬스터 정보:HP
		//1.평타, 2.스킬, 3.HP회복, 4.도망
		//평타: 0~10이하의 공격이 몬스터에게 적용
		//스킬: 0~30이하의 공격이 몬스터에게 적용(최대 3번까지만 가능)
		//회복: 회복량 0~40까지 회복 (40X)
		//도망: 50%확률로 성공, 실패

		//Monster
		//1: 유저 공격 0~40의 공격을 유저에게 공격
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int skillCount = 3;
		
		while(flag) {
			System.out.println("1.평타 2.스킬 3.회복 4.도망");
			int select = sc.nextInt();
			
			if(select==1) {
				//평타
				select = random.nextInt(11); 
				monsterHp -= select; //monsterHp = monsterHp - select
				System.out.println("몬스터에게 "+select+ "피해를 주었습니다.");
				if(monsterHp < 1) {
					System.out.println("몬스터가 죽었습니다.");
					break;
				}
			}else if(select==2) {
				//스킬
				if(skillCount>0) {
					select = random.nextInt(31);
					monsterHp -= select;
					System.out.println("몬스터에게 "+select+ "피해를 주었습니다.");
					if(monsterHp < 1) {
						System.out.println("몬스터가 죽었습니다.");
						break;
					}
					skillCount--;
				}else {
					System.out.println("스킬을 다 소모했습니다.");
				}
			}else if(select==3) {
				//회복
				select = random.nextInt(41);
				userHp += select;
				if(userHp > 40) {
					userHp = 40;
				}
				System.out.println("유저의 체력을 "+select+ "회복했습니다.");
			}else {
				//도망
				select = random.nextInt(1001);
				if(select%2 !=0) {
					System.out.println("도망 성공");
					break;
				}else {
					System.out.println("도망 실패");
				}
			} //유저의 끝
			
			select = random.nextInt(41);
			userHp -= select;
			System.out.println("유저에게 "+select+ "피해를 주었습니다.");
			if(userHp < 1) {
				System.out.println("You Die");
				break;
			}
		} //while 끝
		
	}

}
