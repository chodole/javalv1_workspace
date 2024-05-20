package 스태틱_개념;

class Product{
	static public int count;
	
	public String name;
	public Product() {
		Product.count ++;
	}
}

public class 스태틱1_개념04_기본이론4 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Product p = new Product();
		}
		
		//현재까지 생성된 Product갯수를 알 수 있다.(메모리 누수확인용)
		System.out.println(Product.count);
	}
}
