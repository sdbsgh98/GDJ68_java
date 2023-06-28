package com.iu.study2;

public class Study4_for_ex1 {

	public static void main(String[] args) {
		//0~10미만의 숫자중에서 짝수만 출력해주세요.
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//0~10미만의 숫자중에서 짝수만 출력해주세요.
		//단, if문 사용x
		for(int j=0; j<10; j=j+2) {
			System.out.println(j);
			//j++;
		}
		
		//a~z까지 출력
		for(int i=97; i<=122; i++) { 
			System.out.println((char)i);
		}
		
	}

}
