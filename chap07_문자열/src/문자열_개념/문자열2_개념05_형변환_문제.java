package 문자열_개념;

/*
[문제] 
	아래 데이터에서 꼴등을 삭제 후 다시 문자열로 변경하시오.
	1) 문자열을 잘라서 배열에 저장한다.
	2) 배열에서 꼴등을 삭제한다.
	3) 삭제한 배열을 다시 문자열로 만든다.
[정답]
	str = "김철수/87,이영희/95";
*/

public class 문자열2_개념05_형변환_문제 {
	public static void main(String[] args) {
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] temp = str.split(",");
		String[] name = new String[3];
		int[] score = new int[3];
		
		for(int i=0;i<temp.length;i++) {
			String[] info = temp[i].split("/");
			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
		}
		
		int min = 100;
		int minIndex = 0;
		for(int i=0;i<score.length;i++) {
			if(min>score[i]) {
				min = score[i];
				minIndex = i;
			}
		}
		
		String text = "";
		
		for(int i=0;i<score.length;i++) {
			if(minIndex != i) {
				text += name[i];
				text += "/";
				text += score[i];
				
				if(score.length-1 != i) {
					text += ",";
				}
			}
		}
		
		System.out.println(text);
	}
}
