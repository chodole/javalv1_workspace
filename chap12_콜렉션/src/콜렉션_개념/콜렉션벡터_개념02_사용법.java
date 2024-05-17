package 콜렉션_개념;

import java.util.Vector;

/*
# 배열의 한계
	. 배열은 한번 선언하면 프로그램에서 그 크기를 바꿀 수 없다.
	. 가변배열을 직접 만들어서 사용했지만,
	  자바에서는 Vector 클래스를 통해 가변배열을 제공한다.
# 특징
	. 특이하게 <>꺽쇠를 사용하는데 이를 제네릭(generic)이라고 부른다.
	. 저장할 수 있는 데이터의 타입은 클래스 타입만 가능하다.
	. int, doulbe 이와 같은 기본 자료형을 저장할 수 없기 때문에
	  Integer, Double 과 같은 래퍼 클래스를 이용해야 한다.
# 선언하는 방법
	Vector<Integer> vector = new Vector<Integer>();
	
# 주요 기능
	1. 추가 		: add
	2. 삭제 		: remove
	3. 전부 삭제 	: clear
	4. 개수		: size
	5. 값 읽기	: get (* 배열의 []에 해당)
	6. 값 수정	: set
*/
public class 콜렉션벡터_개념02_사용법 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		// v[0] = 10;
		v.add(10);
//		v.add("문자");
//		v.add(3.14);
//		v.add(true);
		System.out.println(v);
		
		
		
//		int[] vector = new int[무한대];
//		Integer[] vector = new Integer[무한대];
		
		Vector<Integer> vector1 = new Vector<>();				// <> 안에 자료형을 생략하수있으나 추천하지 않는다.
		Vector<Integer> vector2 = new Vector<Integer>();		// 좀 더 명확하다.
		
		Vector<Integer> vector = new Vector<Integer>();
		
		//1.추가하기
		vector.add(10);
		vector.add(20);
		vector.add(30);
		System.out.println(vector.get(0));
		System.out.println(vector.get(1));
		System.out.println(vector.get(2));
		
		//2.길이 구하기
		System.out.println("vector의 개수 ="+vector.size());
		
		//3.인덱스로 값 삭제하기
		vector.remove(0);
		System.out.println(vector);
		
		//4.값 가져오기
		int value = vector.get(0);
		System.out.println(value);
		System.out.println(vector.get(0));
		
		//5.수정하기
		//벡터는 배열과 달리 읽기와 쓰기가 구분되어있다
		//(1)배열
		int[] arr = {10,20,30};
		arr[0] = 100;
		arr[0] = 200;
		
		//(2)벡터
		//vector.get(0) = 100;  //이와같은 문법은 사용할 수 없다
		vector.set(0, 100);     //set을 통해 수정이 가능하다.
		
		//6.전체 출력하기
		for(int i=0; i<vector.size(); i++) {
			System.out.print(vector.get(i)+" ");
		}
		System.out.println();
		
		//7.전부 삭제하기
		vector.clear();
		System.out.println("vector의 개수 ="+vector.size());
		
	}
}
