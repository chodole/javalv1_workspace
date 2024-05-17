package 콜렉션_개념;

import java.util.Random;
import java.util.Vector;

public class 콜렉션벡터_개념05_연속삭제 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = {1,1,3,2,2,3,3,4,4,5,5,4};
		
		Vector<Integer> vector = new Vector<Integer>();
		for(int i=0; i<arr.length; i++) {
			vector.add(arr[i]);
		}
		System.out.println(vector);
		
		// [문제] vector의 숫자3을 삭제하시오.
//		for(int i=0; i<vector.size(); i++) {
//			if(vector.get(i) == 3) {
//				vector.remove(i);
//			}
//		}
//		System.out.println(vector);
		
		// 숫자 3이 전부 지워지지 않았다!
		// 이는 vector의 크기가 변해서 인덱스가 바뀌기 때문이다.
		// 이를 위해 i를 1씩 감소시켜줌으로써 문제를 해결할 수 있다.
		
		for(int i=0; i<vector.size(); i++) {
			if(vector.get(i) == 3) {
				vector.remove(i);
				i-=1;
			}
		}
		System.out.println(vector);
	}
}
