package 배열_개념;

import java.util.Arrays;

/*
	[문제]
		arr배열에서 4의 배수만 골라 temp배열에 저장하시오.
		단, temp의 길이는 4의 배수의 개수 만큼만 설정하시오.
	[정답]
		temp = {44, 24, 76}
*/

public class 배열_개념05_배열생성 {
	public static void main(String[] args) {
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		// java.lang.NullPointerException: 
		// Cannot store to int array because "temp" is null
		// temp[0] = 44;
		
		// 1. arr배열에서 4의 배수의 개수를 구하기
		// 2. temp를 1번에서 구한 개수만큼 생성하기
		//	  예) temp = new int[3];
		// 3. arr배열에서 4의 배수만 temp배열에 저장하기
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%4==0) {
				count++;
			}
		}
		
		temp = new int[count];
		
		int index =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%4==0) {
				temp[index] = arr[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(temp));
	}
}
