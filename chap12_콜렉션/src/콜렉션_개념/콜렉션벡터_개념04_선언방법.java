package 콜렉션_개념;

import java.util.Scanner;
import java.util.Vector;

public class 콜렉션벡터_개념04_선언방법 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Vector<Integer> vector1 = new Vector<>();		// 이렇게 <> 안에 자료형을 생략할 수 있으나 추천하지않음
		
		Vector<Integer> vector2 = new Vector<Integer>();// 이렇게 하는것이 좀 더 명확하다.
		
	}
}
