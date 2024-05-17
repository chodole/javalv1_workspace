package 콜렉션_개념;

import java.util.Arrays;

public class Ex {
	public static void main(String[] args) {
		int count = 0;
		int[] score = null;
		
		score = new int[1];
		score[count] = 10;
		count ++;
		
		int[] temp = score;
		score = new int[2];
		for(int i=0; i<count; i++) {
			score[i] = temp[i];
		}
		score[count] = 20;
		count ++;
		System.out.println(Arrays.toString(score));
		
		temp = score;
		score = new int[3];
		for(int i=0; i<count; i++) {
			score[i] = temp[i];
		}
		score[count] = 30;
		System.out.println(Arrays.toString(score));
	}
}
