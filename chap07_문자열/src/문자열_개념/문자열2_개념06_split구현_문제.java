package 문자열_개념;

import java.util.Arrays;

/*
[문제]
	split() 메서드는 자동으로 문자열을 배열로 만들어준다.
	이 메서드를 사용하지 않고 직접 잘라서 배열에 저장해보자.
[정답]
	[aaa, bbbb, ccc]
*/

public class 문자열2_개념06_split구현_문제 {
	public static void main(String[] args) {
	
		String str = "aaa/bbb/ccc";
		
		String[] arr = new String[3];
		String text = "";
		int index = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '/') {
				arr[index] = text;
				text = "";
				index += 1;
			}else {
				text += str.charAt(i);
			}
		}
		arr[index] = text;
		
		System.out.println(Arrays.toString(arr));
	}
}
