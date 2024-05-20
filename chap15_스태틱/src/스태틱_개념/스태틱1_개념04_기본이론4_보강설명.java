package 스태틱_개념;

class Monster{
	static int count;
	
	void init() {
		System.out.println("몬스터 탄생");
		count++;
	}
	
	void die() {
		System.out.println("몬스터가 죽었습니다");
		count--;
		
		if(count==0) {
			System.out.println("몬스터가 전멸했습니다.");
		}else {
			System.out.println("현재 몬스터는 "+count+" 마리 남았습니다.");
		}
	}
}

public class 스태틱1_개념04_기본이론4_보강설명 {
	public static void main(String[] args) {
		Monster m1 = new Monster();
		m1.init();
		
		Monster m2 = new Monster();
		m2.init();
		
		Monster m3 = new Monster();
		m3.init();
		
		m1.die();
	}
}
