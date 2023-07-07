package com.iu.study4.s4;

import com.iu.study4.s2.Student;
import com.iu.study4.s3.Car;
import com.iu.study4.s5.StaticTest;

public class S4Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.info(); //접근지정자가 public으로 되어있어서 가능.
		
		Product product = new Product();
		product.info();
		
		//=================================
		
		StringBuffer sb = new StringBuffer();
		
		String name = "";
		StaticTest.staticMethod();
	}

}
