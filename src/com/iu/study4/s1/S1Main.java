package com.iu.study4.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Hap hap = new Hap();
		
		int sum = hap.h1(10, 20);
		
		//위에 결과값에 *2값 구하기
		System.out.println(sum*2);
		
		//h2 -> 결과 출력
		boolean check = hap.h2(20);
		System.out.println(check);
		
		//h3 -> return받아서 length 출력
		int[] arr = hap.h3(5);
		System.out.println(arr.length);
	}

}
