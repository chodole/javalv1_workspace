package 생성자_개념;

class Toy{
	String name;
	int price;
	
	//기본 생성자 : 이미 내장되어있는 생성자
	//(1) 리턴타입이 없다.
	//(2) 메서드명을 반드시 클래스명으로 지정해야한다.
	//(3) 클래스 메모리를 생성할 때 (=new) 호출된다.
	Toy(){
		System.out.println("기본 생성자 호출!");
	}
	//생성자 오버로딩
	Toy(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class Ex {
	public static void main(String[] args) {
		
		//Toy() 생성자(constructor)
		Toy t = new Toy();
		//1단계 : 점으로 변수 초기화
		t.name = "인형";
		t.price = 1000;
		
		//2단계: 메서드를 통해 변수 초기화
		t.setData("인형", 1000);
		
		//3단계 : 생성자 메서드를 통해 변수 초기화
		Toy t2 = new Toy("인형",1000);
	}
}
