package 배열_개념;

import java.util.Scanner;

/*
	[문제]
		값을 입력받고 인덱스를 출력하시오.
		단, 없는 값이면 -1을 출력하시오.
	[예시1] 
		입력 : 67
		결과 : 4
	[예시2] 
		입력 : 56
		결과 : -1	 
	*/
public class 배열_개념01_검색예외처리 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int[] array = {10, 543, 52, 24, 67};
		
		System.out.print("입력: ");
		int num = scan.nextInt();
		
		int index = -1;
		for(int i=0;i<array.length;i++) {
			if(num==array[i]) {
				index = i;
				break;
			}
		}
		
		System.out.println("결과: "+index);
		
		scan.close();
	}
}
