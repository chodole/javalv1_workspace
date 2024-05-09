package 문자열_개념;

/*
[문제]
	userData는 회원번호와 이름이다.
	pointData는 포인트점수와 회원번호이다.
	번호가 여러개면 누적할 수 있다.
	점수가 가장 높은 회원의 이름을 출력하시오.
[정답]
	1002회원 : 3점
*/

public class 문자열3_개념02_문자열이차원_문제 {
	public static void main(String[] args) {
		
		String userData = "1001/김철수\n";
		userData += "1002/이만수\n";
		userData += "1003/이영희";
		
		
		String pointData = "1,1001\n";
		pointData += "1,1002\n";
		pointData += "2,1003\n";
		pointData += "1,1001\n";
		pointData += "2,1002";
		
		String[] userTemp = userData.split("\n");
		String[] pointTemp = pointData.split("\n");
		
		String[][] userList = new String[3][2];
		String[][] pointList = new String[5][2];
		
		for(int i=0; i<userTemp.length; i++) {
			String[] temp = userTemp[i].split("/"); 
			userList[i][0] = temp[0];
			userList[i][1] = temp[1];
		}
		
		for(int i=0; i<pointTemp.length; i++) {
			String[] temp = pointTemp[i].split(",");
			pointList[i][0] = temp[0];
			pointList[i][1] = temp[1];
		}
		
		int[] count = new int[3];
		
		for(int i=0; i<userList.length;i++) {
			for(int j=0; j<pointList.length;j++) {
				if(userList[i][0].equals(pointList[j][1])) {
					count[i] += Integer.parseInt(pointList[j][0]);
				}
			}
		}
		
		int max = 0;
		int maxIndex = 0;
		for(int i=0; i<count.length;i++) {
			if(max < count[i]) {
				max = count[i];
				maxIndex = i;
			}
		}
		
		System.out.println(userList[maxIndex][0]+"회원 : "+count[maxIndex]+"점");
		
	}
}
