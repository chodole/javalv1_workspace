package 문자열_개념;

import java.util.Scanner;

/*
[문제]
	끝말잇기 게임을 만들어보시오.
	
	제시어 : 자전거
	입력 : 거미
	
	제시어 : 거미
	입력 : 미술
	
	...
*/

public class 문자열1_개념10_끝말잇기_문제 {
	public static void main(String[] args) {
	
		String str = "자전거";
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("제시어 : "+str);
			
			System.out.print("입력 : ");
			String myStr = scan.next();
			
			char temp1 = str.charAt(str.length()-1);
			char temp2 = myStr.charAt(0);
			
			if(myStr == "0") {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			if(temp1==temp2) {
				str = myStr;
			}else {
				System.out.println("끝말과 다른 단어입니다.");
			}
		}
		
		scan.close();
		
	}
}
