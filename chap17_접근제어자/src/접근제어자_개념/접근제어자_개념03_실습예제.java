package 접근제어자_개념;

//a 는 private 이므로 사용불가
//b 는 public 이므로 어느클래스에서나 사용가능
//c 는 protected 이므로 자식클래스인 Test클래스 내부에서만 사용가능 
//d 는 default 는 패키지가 달라지면 private 이므로 사용불가 (사용하지않는것이 좋다)

class L2_Child extends 접근제어자_개념01_기본이론1{
	public L2_Child(){
		//a = 10; 	// a는 private 이므로 사용불가
		b = 10; 	// b는 public 이므로 사용가능
		c = 10; 	// c는 protected 이므로 자식클래스에서는 사용가능하다.
		//d = 10; 	// default 는 패키지가 달라지면 private 으로 변한다.(사용하지않는것이 좋다)
	}
}

public class 접근제어자_개념03_실습예제 {
	public static void main(String[] args) {
		
		L2_Child child = new L2_Child();
		child.b = 10; // b는 public 이므로 사용가능.
		// 여기서는 오직 b만 사용가능하다. 
		
	}
}
