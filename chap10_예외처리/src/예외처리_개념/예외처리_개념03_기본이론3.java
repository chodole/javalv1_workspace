package 예외처리_개념;

public class 예외처리_개념03_기본이론3 {
	public static void main(String[] args) {
		// 에러의 종류가 너무 많기 때문에 
		// 모든 에러를 다 잡아주는  Exception을 보통 사용한다. 
		
		int[] arr = new int[3];
		try {
			arr[100] = 100;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		int a = 10;
		try {
			int b = a/10;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String str = "aaa";
		try {
			int num = Integer.parseInt(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
