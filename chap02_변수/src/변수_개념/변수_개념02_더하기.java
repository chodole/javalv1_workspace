package 변수_개념;

import java.util.Scanner;

/*
	[문제]
		숫자 2개를 입력받고, 그 합을 구하시오.
		예) 3, 5 ==> 8
	*/
public class 변수_개념02_더하기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 :");
		int num1 = scan.nextInt();
		
		System.out.print("숫자를 입력하세요 :");
		int num2 = scan.nextInt();
		
		int sum = num1+num2;
		
		System.out.println(sum);
		
	}
}
