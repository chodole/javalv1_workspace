package 조건문_개념;

import java.util.Scanner;

/*
	[문제] Up & Down 게임
		1. com은 8이다.
		2. me는 숫자 하나를 입력한다.
		3. com과 me를 비교해 다음과 같은 메세지를 출력한다.
			1) me	<	com		: Up!
			2) me	>	com		: Down!
			3) me   ==  com		: Bingo!
*/
public class 조건문_개념02_업다운 {
	public static void main(String[] args) {
		int com = 8;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int me = scan.nextInt();
		
		if(me<com) {
			System.out.println("UP!");
		}else if(me>com) {
			System.out.println("Down!");
		}else {
			System.out.println("Bingo!");
		}
		
		scan.close();
	}
}
