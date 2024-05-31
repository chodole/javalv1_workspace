package 인터페이스_개념;

import java.util.Random;

interface Skill{
	public abstract void skill();
	public abstract void skillAttack(Unit unit);
	public abstract void attack(Unit unit);
}

class Unit implements Skill {
	public int MAX_HP;
	public int hp;
	public int power;
	
	public Unit(int hp, int power) {
		MAX_HP = hp;
		this.hp = MAX_HP;
		this.power = power;
	}
	
	@Override
	public String toString() {
		return hp+"/"+MAX_HP;
	}
	
	@Override
	public void skill() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void skillAttack(Unit unit) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attack(Unit unit) {
		// TODO Auto-generated method stub
		
	}
}

class Wolf extends Unit{
	public int leg;
	public int bite;
	
	public Wolf(int leg, int bite) {
		super(100, 10);
		this.leg = leg;
		this.bite = bite;
	}
	
	public void skill() {
		power += leg+bite;
		System.out.println("다리개수와 이빨개수만큼 공격력이 향상했다! power ="+power);
	}
	
	@Override
	public void attack(Unit unit) {
		Random ran =new Random();
		int rNum = ran.nextInt(10)+1;
		
		unit.hp -= power;
		unit.hp -= rNum;
		
		System.out.println("Wolf가 기본 데미지"+this.power+"을(를) 입혔습니다.");
		System.out.println("Wolf가 추가 데미지"+rNum+"을(를) 입혔습니다.");
	}
	
	@Override
	public void skillAttack(Unit unit) {}
	
}

class Bat extends Unit{
	public int fly;
	public int posion;
	
	public Bat(int fly, int posion) {
		super(50,5);
		this.fly = fly;
		this.posion = posion;
	}
	
	@Override
	public void attack(Unit unit) {
		unit.hp -= power;
		System.out.println("Bat가 기본 데미지"+this.power+"을(를) 입혔습니다.");
	}
	
	@Override
	public void skill() {}
	
	@Override
	public void skillAttack(Unit unit) {
		unit.hp -= power*2;
		System.out.println("Bat가 스킬 데미지"+this.power*2+"을(를) 입혔습니다.");
	}
}

public class 인터페이스_개념04_RPG {
	public static void main(String[] args) {
		/*
		 * # 다형성
		 * 1. 서로 다른 클래스는 배열에 저장이 불가능하기 때문에
		 * 2. 공통 부모를 상속받아
		 * 3. 부모 클래스로 배열을 만들면 한 배열에 서로 다른 클래스들을 저장할 수 있다.
		 */
		
		Unit[] unitList = new Unit[5];
		
		Wolf wolf = new Wolf(3, 10);
		unitList[0] = wolf;
		unitList[0].skill();
		
		Bat bat = new Bat(10, 15);
		unitList[1] = bat;
		
		unitList[0].attack(unitList[1]);
		System.out.println(unitList[1]);
		
		unitList[1].attack(unitList[0]);
	}
}
