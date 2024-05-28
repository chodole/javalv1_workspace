package 상속_개념;

//class Object{
//public String toString() {
//	
//	return "주소";
//}
//}

class TestAA {
	public String toString() { //선언부
		//구현부
		return "재정의"; 
	}
}

public class 상속_개념08_toString2 {
	public static void main(String[] args) {
		
		//메서드 오버로드(overload)
		//메서드 오버라이드(override)
		TestAA a = new TestAA();
		System.out.println(a.toString());//메모리주소출력
		System.out.println(a); //toString()은 생략가능
	}
}
