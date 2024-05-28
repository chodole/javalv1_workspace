package 접근제어자_개념;

public class 접근제어자_개념02_기본이론2 {
	public static void main(String[] args) {
		
		접근제어자_개념01_기본이론1 t =new 접근제어자_개념01_기본이론1();
		// t.a = 10; // private 은 내부 클래스 에서만 사용가능 	
		
		t.b = 10; // 같은패키지에 있으면 public 사용가능
		t.c = 20; // 같은패키지에 있으면 protected 사용가능
		t.d = 30; // 같은패키지에 있으면 default 사용가능
		
	}
}
