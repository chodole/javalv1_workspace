package 배열_개념;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
	(1) 삽입할 위치 (2) 삽입할 값
	삽입할 위치를 랜덤(0 ~ 2)으로 저장하고, 
	삽입할 위치를 기준으로 전부 뒤로 한 칸씩 이동한 후,
	삽입할 값을 삽입할 위치에 저장한다.
[예시]
	index = 2
	arr = {10, 20, 60, 30, 0}
	
	index = 1
	arr = {10, 60, 20, 30, 0}
*/

public class 배열_개념08_삽입원리 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = { 10,20,30,0,0 };
		int value = 60;		// 삽입할 값
		
		int index = ran.nextInt(3);
		//index = 1;
		System.out.println("index = " + index);
		
		for(int i=arr.length-1;i>index;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = value;
		System.out.println(Arrays.toString(arr));
	}
}	
