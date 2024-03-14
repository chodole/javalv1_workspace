package 조건문_개념;

import java.util.Scanner;

/*
	[문제] 점수 유효성 검사
		1. 점수 2개를 입력받아 평균을 구한다.
		2. 평균이 60점 이상이면 합격, 60점 미만이면 불합격이다.
		3. 조건1)
		   입력받은 정수가 음수이거나 100점을 초과하면,
		   오류 메세지를 출력한다.
		   예) 점수를 잘 못 입력했습니다.
		4. 조건2)
		   평균이 60점 이상이라도 한 과목이라도 50점 미만이면,
		   불합격을 출력한다.
*/
public class 조건문_개념01_합격 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수1 입력:");
		int num1 = scan.nextInt();
		
		System.out.print("점수2 입력:");
		int num2 = scan.nextInt();
		
		System.out.printf("num1 = %d, num2 = %d \n",num1,num2);
		
		int avg = (num1+num2)/2;
		
		if(num1<0 || num1 >100 || num2<0 || num2>100) {
			System.out.println("점수를 잘 못 입력했습니다");
		}else {
			if(avg>=60) {
				if(num1<50 || num2<50) {
					System.out.println("불합격");
				}else {
					System.out.println("합격");
				}
			}else {
				System.out.println("불합격");
			}
		}
		
		scan.close();
	}
}
