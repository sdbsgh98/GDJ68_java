package com.iu.study4.s5;

public class StaticTest {
	
	public int instanceNum;
	
	public static int staticNum;
	
	public void instanceMethod() {
		StaticTest.staticNum = 50;
		instanceNum = 20;
		StaticTest.staticMethod();
		System.out.println("멤버메서드");
	}
	
	public static void staticMethod() {
		StaticTest.staticNum = 20;
		//instanceMethod(); -> 에러발생
		//instanceNum = 50; -> 에러발생
		System.out.println("클래스메서드");
	}
	
	/*
	 * System.out -> 클래스변수
	 */

}
