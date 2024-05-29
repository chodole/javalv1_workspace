package 추상화_개념;

class Parent{
	public int a;
}

class Child extends Parent{
	public int b;
}

public class 추상화_개념05_형변환2 {
	public static void main(String[] args) {
		
Parent p1 = new Parent(); 
		
		// new Child();는 Parent, Child 둘 다 생성되므로  
		// 어느 변수에나 담을수 있다.
		Parent p2 = new Child();  
		
		// new Parent();는 부모만 생성되기때문에 child에 담을 수 없다.
		// Child c1 = new Parent(); 	// 이렇게 하면 에러가 발생된다. 	
		// Child c2 = (Child)p1; 		// 이렇게 하면 에러가 발생된다.
				
		Child c3 = new Child();   
		
		Parent p3 = (Parent)c3;
		
		System.out.println("-----------------------------------");
		
		// instanceof 키워드를 사용하면 좀더 확실히 예외처리 할수있다.
		
		if(p1 instanceof Child) {
			Child ch = (Child)p1;
			System.out.println("형변환 성공1");
		}else {
			System.out.println("형변환 불가1");
		}
		
		
		if(p2 instanceof Child) {
			Child ch = (Child)p2;
			System.out.println("형변환 성공2");
		}else {
			System.out.println("형변환 불가2");
		}
		
	}
}
