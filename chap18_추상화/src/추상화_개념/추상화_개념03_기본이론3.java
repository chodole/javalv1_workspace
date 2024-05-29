package 추상화_개념;

/*
	상속의 종류 3가지
	(1) 상속
		extends, 한번만 상속 가능
	(2) 추상화
		abstract 부모클래스
		abstract 메서드();
		부모의 abstract메서드를 자식이 반드시 구현implement(중괄호)해야 한다. 
	(3) 인터페이스
*/

abstract class Monster{
	abstract void skill();
	abstract void attack();
	abstract void deffense();
}

class Cat extends Monster{

	void fishAttack() {
		System.out.println("물고기 공격!");
	}
	
	@Override
	void skill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void attack() {
		System.out.println("고양이 공격!");
		
	}

	@Override
	void deffense() {
		// TODO Auto-generated method stub
		
	}
	
}

class Dog extends Monster{

	@Override
	void skill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deffense() {
		// TODO Auto-generated method stub
		
	}
	
}

class Bear extends Monster{

	@Override
	void skill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deffense() {
		// TODO Auto-generated method stub
		
	}
	
}

class Player{
	
}

public class 추상화_개념03_기본이론3 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bear bear = new Bear();
		
		Monster[] monsterList = new Monster[3];
		monsterList[0] = cat;
		monsterList[1] = dog;
		monsterList[2] = bear;
		
		monsterList[0].attack();
		
		Cat c = (Cat)monsterList[0];
		
		c.fishAttack();
	}
}
