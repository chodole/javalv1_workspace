package 콜렉션응용_개념;

import java.util.ArrayList;
import java.util.Collections;

/*
Collections 정렬 
자바에서 제공하는 성능좋은 정렬 (직접만드는게 힘들때 사용)

[1] Comparable<Fruit> 을 인터페이스 상속을 받는다.

[2] public int compareTo(Fruit fruit){}
	메서드를 강제 구현해야한다.
	
[3] 정렬하고 싶은 내용을 구체적으로 적는다.  

	int check = 0;
	if(price - fruit.price > 0) {
		check = -1;
	}else if(price - fruit.price < 0) {
		check = 1;
	}
		return check;
	
*/

class Fruit implements Comparable<Fruit> {
	
	private String name;
	private int price;
	
	public Fruit() {}
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Fruit fruit) {
		//정수비교
		int check = 0;
		if(price > fruit.price) {
			check = -1;
		}else if(price < fruit.price) {
			check = 1;
		}
		return check;
		
		//문자비교
		//return name.compareTo(fruit.name);
	}
	
	@Override
	public String toString() {
		return name + " : "+ price;
	}
}

public class 콜렉션종류_기본이론4_정렬 {
	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<>();
		
		list.add(new Fruit("사과",3000));
		list.add(new Fruit("귤",1000));
		list.add(new Fruit("오렌지",2000));

		Collections.sort(list);
		
		System.out.println(list);
	}
}
