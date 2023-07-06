package com.iu.study4.s3;

public class Car {
	
	String company; //생략되어있으면 접근지정자가 default이다.
	String brand;
	public String color;
	int price;
	
	//생성자(Constructor)
	//접근지정자 클래스명과 동일한이름([매개변수 선언]) {}
	public Car() {
		//기본생성자
		this("A7");
//		System.out.println("자동차를 만들니다.");
//		this.company = "AUDI";
//		this.brand = "A7";
//		this.color = "Black";
//		this.price = 9985;
	}
	
	public Car(String brand) {
		this(brand, "PINK");
//		System.out.println("자동차를 만들니다.");
//		this.company = "AUDI";
//		this.brand = brand;
//		this.color = "Black";
//		this.price = 9985;
	}
	
	public Car(String brand, String color) {
		this(brand, color, 9985);
//		System.out.println("자동차를 만들니다.");
//		this.company = "AUDI";
//		this.brand = brand;
//		this.color = color;
//		this.price = 9985;
	}
	
	public Car(String brand, String color, int price) {
		System.out.println("자동차를 만들니다.");
		this.company = "AUDI";
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void info() {
		System.out.println("Company: "+this.company);
		System.out.println("Brand: "+this.brand);
		System.out.println("Color: "+this.color);
		System.out.println("Price: "+this.price+"만원");
		
	}
	
}
