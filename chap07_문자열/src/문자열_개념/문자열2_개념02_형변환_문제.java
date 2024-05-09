package 문자열_개념;

public class 문자열2_개념02_형변환_문제 {
	public static void main(String[] args) {
		
		String str = "11/100/89";
		// [문제1] arr배열에 각 점수를 저장하고, 총점을 출력하시오.
		// [정답1] 200
		int[] arr = new int[3];
		
		String[] temp = str.split("/");
		
		int total = 0;
		for(int i=0;i<temp.length;i++) {
			arr[i] = Integer.parseInt(temp[i]);
			total += arr[i];
		}
		System.out.println(total);
		
		// [문제2] scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결하시오.
		// [정답2] 11/100/89
		int[] scores = {11, 100, 89};
		
		String text = "";
		for(int i=0; i<scores.length;i++) {
			text += scores[i];
			if(i != scores.length-1) {
				text+="/";
			}
		}
		System.out.println(text);
		
		/*
		 
		 for(int i=0; i<scores.length;i++){
		 		 text += scores[i];
		 		 text += "/";
		 }
		 System.out.println(text);
		 
		 text = text.substring(0, text.length() - 1);
		 System.out.println(text);
		*/
		
	}
}
