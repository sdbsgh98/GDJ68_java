package com.iu.study4.s2;

public class Chef {
	
	String name;
	
	public Ramyun[] makeRamyun(int count) {
		
//		Ramyun ramyun = new Ramyun();
//		Ramyun ramyun2 = new Ramyun();
//		ramyun2 = ramyun;
//		ramyun2 = new Ramyun();
		
		Ramyun[] ramyuns = new Ramyun[count];
		
		for(int i=0; i<count; i++) {
			Ramyun ramyun = new Ramyun();
			ramyuns[i] = ramyun;
			
			ramyuns[i].title = "진라면";
			ramyuns[i].price = 3000;
		}
		
		return ramyuns;
	}
	
	public void makeRamyun2(Ramyun[] ramyuns) {
		
		for(int i=0; i<ramyuns.length; i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title = "진라면";
			ramyun.price = 3000;
			ramyuns[i] = ramyun;
		}
	}
	
	public void makeKimbap() {
		
	}
	
}
