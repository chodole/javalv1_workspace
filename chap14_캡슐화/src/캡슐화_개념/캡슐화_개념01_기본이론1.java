package 캡슐화_개념;

class Test01{
	//접근제어자 : public, protected(추후설명), default, private
	private int a;
	private int b;
	
	//접근제어가 없는 것을 default라고 부른다.
	//지금까지는 접근제어자를 사용하지 않았지만, 정확하게 명시해주는 것이 좋다
	//이제부터 아무것도 안적는것은 권장하지 않는다
	int c;
	
	//public은 어느 클래스에서도 접근 가능한 것
	public int d;
}

public class 캡슐화_개념01_기본이론1 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		
		//1.private를 붙인 변수는 클래스 내부에서만 사용이 가능하다.
		//2.다른 클래스에서는 사용할 수 없다.
		//the field Test01.a is not visible
		//t.a = 10; //에러
		//t.b = 20; //에러
		
		t.c = 30;
		t.d = 40;
	}
}
