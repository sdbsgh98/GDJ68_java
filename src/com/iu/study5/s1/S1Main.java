package com.iu.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Warrior warrior = new Warrior();
		warrior.getItem();
		Magician magician = new Magician();
		magician.getItem();
		
		//Animal animal = new Animal();
		
		//warrior.axe.name;
		Character character = magician;
		
		magician.setHp(20);
		magician = (Magician)character;
		magician.setMp(0);
		
		character = warrior;
		
		Character[] w = new Character[2];
		w[0] = warrior;
		w[1] = magician;
		
		warrior = (Warrior)w[0];
		magician = (Magician)w[1];
		
		magician = (Magician)w[1];
		magician.setMp(20);
		
		//================================
		
		//이 코드는 에러발생
		Character ch1 = new Character();
		magician = (Magician)ch1;
		magician.setMp(20);
		
		
	}

}
