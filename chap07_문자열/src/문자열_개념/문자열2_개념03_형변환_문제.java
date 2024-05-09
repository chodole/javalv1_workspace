package 문자열_개념;

import java.util.Arrays;

public class 문자열2_개념03_형변환_문제 {
	public static void main(String[] args) {
		
		// [문제] 이름은 name배열에, 성적은 score배열에 각각 저장 및 출력하시오.
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		String[] temp = str.split(",");
		
		for(int i=0;i<temp.length;i++) {
			String[] temp2 = temp[i].split("/");
			
			name[i] = temp2[0];
			score[i] =Integer.parseInt(temp2[1]);
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	}
}
