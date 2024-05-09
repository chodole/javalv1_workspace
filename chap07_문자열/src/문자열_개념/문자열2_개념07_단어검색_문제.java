package 문자열_개념;

import java.util.Scanner;

/*
[문제]
	단어를 입력받아 text배열에 해당 단어가 있는지 검색한다.
	단어가 존재하면 출력한다.
	단, 부분 검색도 가능해야 한다.
[예시] 
	ch ==> school, teacher, child
*/

public class 문자열2_개념07_단어검색_문제 {
	public static void main(String[] args) {
		
		String[] text = {"school", "teacher", "child", "father", "love"};
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("입력 :");
		String str = scan.next();
		
		for(int i=0; i<text.length; i++) {
			boolean check = false;
			
			for(int j=0; j<text[i].length() - str.length() + 1;j++) {
				int count = 0;
				
				for(int k=0; k<str.length(); k++) {
					if(text[i].charAt(j+k) == str.charAt(k)) {
						count++;
					}
				}
				
				if(count == str.length()) {
					check = true;
					break;
				}
			}
			
			if(check) {
				System.out.print(text[i] + " ");
			}
		}
		
		scan.close();
	}
}
