package 문자열_개념;

/*
[문제]
	주민번호 정보를 통해 성별과 나이를 출력하시오.
[정답]
	성별 : 여성
	나이 : 34세
*/

public class 문자열1_개념12_주민번호검사_문제 {
	public static void main(String[] args) {
		
		String jumin = "890101-2012932";
		
		String[] temp = jumin.split("-");
		
		int year = Integer.parseInt(temp[0].substring(0,2));
		int age = 2024-(1900+year);
		
		char gender = temp[1].charAt(0);
		if(gender == '1' || gender == '3') {
			System.out.println("성별 : 남성");
		}else if(gender == '2' || gender == '4') {
			System.out.println("성별 : 여성");
		}
		
		System.out.println("나이 : "+age+"세");
	}
}
