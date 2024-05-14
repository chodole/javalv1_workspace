package 예외처리_개념;

class Test{
	// 예외처리하는 2가지방법
	// (1) try {} 안에  식을 적는다.
	void sample1() {
		try {
			int a = 10/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// (2) 메서드 이름 옆에 throws Exception 을 적는다. 
	//     조건) 대신, 메서드 호출할때 try{}로 감싸줘야한다. 
	void sample2() throws Exception {
		int a = 10/0;
	}
	
}

public class 예외처리_개념06_기본이론6 {
	public static void main(String[] args) {
		
		Test  t = new Test();
		try {
			t.sample1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			t.sample2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
