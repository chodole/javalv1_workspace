package 콜렉션_개념;

import java.util.Scanner;

public class 가변배열_개념02_학생관리_문제 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numberList = null;			// 번호
		int[][] scoreList = null;			// 성적 3개
		int count = 0;
		int num = 1001;
		
		while(true) {
			
			for(int i=0; i<count; i++) {
				System.out.print(numberList[i] + " ");
				for(int j= 0; j < 3 ; j++) {
					System.out.print(scoreList[i][j] + " ");
				}
				System.out.println();				
			}
			System.out.println();				
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[0]종료");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(학생번호)");
			System.out.println("[4]삽입");
					
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}
			else if(sel == 1) {
				if(count == 0) {
					numberList = new int[1];
					scoreList= new int[1][3];
				}else {
					int[] numTemp = numberList;
					int[][] scoreTemp = scoreList;
					
					numberList = new int[count + 1];
					scoreList = new int[count + 1][];
					scoreList[count] = new int[3];
					
					for(int i = 0; i < count; i++) {
						numberList[i] = numTemp[i];
						scoreList[i] = scoreTemp[i];
					}
				}
				
				numberList[count] = num;
				for(int i = 0; i < 3; i++) {
					System.out.println("[추가] 과목"  + (i + 1) + " 점수 : ");
					scoreList[count][i] = scan.nextInt();
				}
				num += 1;
				count += 1;
				
			}
			else if(sel == 2) {
				if(count > 0) {
					System.out.println("[삭제] 인덱스 입력 : ");
					int check = scan.nextInt();
					
					if(0 <= check && check < count) {
						int[] numTemp = numberList;
						int[][] scoreTemp = scoreList;
						
						numberList = new int[count - 1];
						scoreList = new int[count - 1][3];
						
						int index = 0;
						for(int i=0; i<numTemp.length; i++) {
							if(i != check) {
								numberList[index] = numTemp[i];
								index += 1;
							}
						}
						
						index = 0;
						for(int i=0; i<scoreTemp.length; i++) {
							if(i != check) {
								scoreList[index] = scoreTemp[i];
								index += 1;
							}
						}
						
						count -= 1;
					} else {
						System.out.println("인덱스를 확인해주세요.");
					}
				} else {
					System.out.println("삭제할 정보가 없습니다.");
				}
			}
			else if(sel == 3) {
				if(count > 0) {
					System.out.println("[삭제] 번호 입력 : ");
					int number = scan.nextInt();
					
					int check = -1;
					for(int i=0; i<count; i++) {
						if(numberList[i] == number) {
							check = i;
							break;
						}
					}
					
					if(check == -1) {
						System.out.println("번호를 확인해주세요.");
					} else {
						int[] numTemp = numberList;
						int[][] scoreTemp = scoreList;
						
						numberList = new int[count - 1];
						scoreList = new int[count - 1][3];
						
						int index = 0;
						for(int i=0; i<numTemp.length; i++) {
							if(i != check) {
								numberList[index] = numTemp[i];
								index += 1;
							}
						}
						
						index = 0;
						for(int i=0; i<scoreTemp.length; i++) {
							if(i != check) {
								scoreList[index] = scoreTemp[i];
								index += 1;
							}
						}
						
						count -= 1;
					}
				} else {
					System.out.println("삭제할 정보가 없습니다.");
				}
			}
			else if(sel == 4) {
				System.out.print("[삽입] 인덱스 입력 : ");
				int index = scan.nextInt();
				
				if(0 <= index && index <= count) {
					
					if(count == 0) {
						numberList = new int[1];
						scoreList= new int[1][3];
					}else {
						int[] numTemp = numberList;
						int[][] scoreTemp = scoreList;
						
						numberList = new int[count + 1];
						scoreList = new int[count + 1][];
						scoreList[index] = new int[3];

						int j = 0;
						for(int i = 0; i < count + 1; i++) {
							if(i != index) {
								numberList[i] = numTemp[j];
								scoreList[i] = scoreTemp[j];
								
								j += 1;
							}
						}
					}
					
					numberList[index] = num;
					for(int i = 0; i < 3; i++) {
						System.out.println("[추가] 과목"  + (i + 1) + " 점수 : ");
						scoreList[index][i] = scan.nextInt();
					}
					num += 1;
					count += 1;
					
				} else {
					System.out.println("해당 위치에는 삽입할 수 없습니다.");
				}
			}
		}
		
		scan.close();
		
	}
}
