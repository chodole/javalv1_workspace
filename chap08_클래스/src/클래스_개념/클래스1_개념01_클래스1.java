package 클래스_개념;


class Member {
	int number;
	String id;
	String pw;
	String name;
	int score;
}

class Test01{
	int x;
	int y;	
}

public class 클래스1_개념01_클래스1 {
	public static void main(String[] args) {
		
		// 변수 : 값 1개 저장
		// 배열 : 같은 종류의 값 여러개 저장
		// 클래스 : 여러 종류의 값 여러개 저장
		
		String[] data = {"1","qwer","1234","김철수","30"};
		int number = Integer.parseInt(data[3]);
		int score = Integer.parseInt(data[4]);
		
		Member member = new Member();
		member.number = 1;
		member.id = "qwer";
		member.pw = "1234";
		member.name = "김철수";
		member.score = 30;
	}
}
