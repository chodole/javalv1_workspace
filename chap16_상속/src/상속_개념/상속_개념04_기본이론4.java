package 상속_개념;

import java.util.Random;

class Test1 extends Random{}

class Test2{
	Random ran = new Random();
}

public class 상속_개념04_기본이론4 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		int r1 = t1.nextInt(100);
		System.out.println(r1);
		
		Test2 t2 = new Test2();
		int r2 = t2.ran.nextInt(100);
		System.out.println(r2);
	}
}
