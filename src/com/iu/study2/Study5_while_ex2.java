package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		//TRPG
		int hp = 40; //유저의 HP
		int monsterHp = 60; //몬스터의 HP
		int monsterPower = 40; //몬스터의 공격력
		
		//유저정보:HP, 몬스터 정보:HP
		//1.평타, 2.스킬, 3.HP회복, 4.도망
		//평타: 0~10미만의 공격이 몬스터에게 적용
		//스킬: 0~30미만의 공격이 몬스터에게 적용(최대 3번까지만 가능)
		//회복: 회복량 0~40까지 회복 (40X)
		//도망: 50%확률로 성공, 실패

		//Monster
		//1: 유저 공격 0~40의 공격을 유저에게 공격
		
		while(monsterHp==0 | hp==0) {
			System.out.println("1.평타, 2.스킬, 3.HP회복, 4.도망중 하나를 선택해주세요.");
			int select = sc.nextInt();
			
			if(select==1) {
				int attack = random.nextInt(10);
				monsterHp = monsterHp - attack;
			}else if(select==2) {
				int skill = random.nextInt(30);
				monsterHp = monsterHp - skill;
			}else if(select==3) {
				int hpRecovery = random.nextInt(40);
				hp = hp + hpRecovery;
			}else {
				int run = random.nextInt(2);
				
			}
		}
		
	}

}
