package 문자열_개념;

import java.util.Scanner;

/*
[문제]
	equals() 메서드 사용없이 문자의 일치여부를 비교하시오.
[예시]
	코끼리
	입력 : 티라노사우루스
	출력 : false
*/

public class 문자열1_개념11_문자열비교_문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.println(name);
		System.out.print("동물의 이름을 입력하세요 : ");
		String myName = scan.next();
		
		int count = 0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) == myName.charAt(i)) {
				count++;
			}else {
				count = 0;
			}
		}
		
		if(count == name.length()) {
			System.out.println("출력 : true");
		}else {
			System.out.println("출력 : false");
		}
	}
}
