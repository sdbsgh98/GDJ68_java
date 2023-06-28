package com.iu.study2;

import java.util.Scanner;

public class Study4_for2_ex1 {

	public static void main(String[] args) {
		
		//FPS
		//30발, 3탄창
		//M16, 2가지: 단발, 3점사
		
		//1.단발 -> 탕, 2.점사 -> 타타탕
		
		Scanner sc = new Scanner(System.in);
		
		for(int tan=0; tan<3; tan++) {
			System.out.println("1.점사, 2.단발");
			int select = sc.nextInt();
			int count = 10; 
			String sound="타타탕";
			
			if(select==1) {
				count = 30;
				sound = "탕";
			}
//			else {
//				count = 10;
//				sound = "타타탕";
//			}
			for(int b=0; b<count; b++) {
				System.out.println(sound);
			}
			
//			if(select==1) {
//				for(int i=0; i<30; i++) {
//					System.out.println("탕");
//				}
//			}else {
//				for(int j=0; j<10; j++) {
//					System.out.println("타타탕");
//				}
//			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
