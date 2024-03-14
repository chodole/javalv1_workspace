package 배열_개념;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제]
		아래 c배열은 번호와 값이 한 쌍인 배열이다.
		번호를 하나 입력받아 c배열에 있는 번호이면,
		그 번호와 값만 제외하고 d배열에 복사한다.
	[예시]
		입력 : 1002
		결과 : d = {1001, 40, 1003, 70 , 0, 0}
*/

public class 배열_개념07_삭제원리2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] c = { 1001, 40, 1002, 65, 1003, 70 };
		int[] d = { 0, 0, 0, 0, 0, 0 };
		
		System.out.print("입력 : ");
		int bunho = scan.nextInt();	// 1002
		
		int index = -1;
		for(int i=0;i<c.length;i++) {
			if(i%2==0&&bunho==c[i]) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("값을 잘못 입력했습니다.");
		}else {
			int idx = 0;
			for(int i=0;i<c.length;i++) {
				if(i%2==0&& i!=index) {
					d[idx] = c[i];
					d[idx+1] = c[i+1];
					idx+=2;
				}
			}
			
			System.out.println(Arrays.toString(d));
		}
	}
}
