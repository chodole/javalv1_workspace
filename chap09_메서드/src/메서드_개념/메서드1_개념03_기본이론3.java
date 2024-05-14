package 메서드_개념;
/*
# 메서드 기본구조
(1) 정의
	1) void					: 키워드
	2) setNums				: 이름
	3) (int a , int b )		: 전달된 값을 저장하는 변수(매개변수, parameter)
	3) { 기능 }				: 실행되는 영역
(2) 사용법
	1) test1.setNums(10, 20);
	2) test1				: 클래스 변수명
	3) .setNums				: .메서드명
	4) (10, 20);			: (전달할 값); (인자, argument)
*/

class Test03{
	int num1;
	int num2;
	
	void setNum(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	void printNums() {
		System.out.println(num1 +" "+ num2);
	}
}
public class 메서드1_개념03_기본이론3 {
	public static void main(String[] args) {
		Test03 t1 = new Test03();
		t1.num1 = 10;
		t1.num2 = 20;
		System.out.println(t1.num1 +" "+t1.num2);
		
		Test03 t2 = new Test03();
		t2.setNum(10, 20);
		t2.printNums();
	}
}
