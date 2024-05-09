package 문자열_개념;

/*
[문제]
	scoreList배열의 값을 콤마(,)를 구분자로
	data 문자열에 연결하시오.
	단, 내림차순으로 정렬하여 연결하시오.
[정답]
	data = 54,43,32,12
*/

public class 문자열2_개념01_형변환_문제 {
	public static void main(String[] args) {
		
		int[] scoreList = {12,32,54,43};
		String data = "";
		
		for(int i=0; i<scoreList.length;i++) {
			for(int j=0; j<scoreList.length;j++) {
				if(scoreList[i] > scoreList[j]) {
					int temp = scoreList[i];
					scoreList[i] = scoreList[j];
					scoreList[j] = temp;
				}
			}
		}
		
		for(int i=0; i<scoreList.length;i++) {
			data += scoreList[i];
			if(i != scoreList.length-1) {
				data+=",";
			}
		}
		
		System.out.println(data);
	}
}
