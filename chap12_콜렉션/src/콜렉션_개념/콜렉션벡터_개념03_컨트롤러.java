package 콜렉션_개념;

import java.util.Scanner;
import java.util.Vector;

public class 콜렉션벡터_개념03_컨트롤러 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Vector<Integer> vector = new Vector<Integer>();
		
		while(true) {
			for(int i=0; i<vector.size(); i++) {
				System.out.print(vector.get(i)+ " ");
			}
			System.out.println();
			
			System.out.println(">>>벡터 컨트롤러 <<<");
			System.out.println("[1]추가");
			System.out.println("[2]삭제");
			System.out.println("[3]수정");
			System.out.println("[0]종료");
			
			int sel=scan.nextInt();
			
			if(sel == 0) {
				break;
			}else if(sel == 1) {
				System.out.print("[추가] 값 입력 :");
				int num = scan.nextInt();
				
				vector.add(num);
			}else if(sel == 2) {
				System.out.print("[삭제] 값 입력 :");
				int num = scan.nextInt();
				
				boolean check = false;
				for(int i=0; i<vector.size(); i++) {
					if(num == vector.get(i)) {
						vector.remove(i);
						check = true;
						break;
					}
				}
				
				if(check == false) {
					System.out.println("해당 값은 존재하지 않습니다.");
				}
			}else if(sel == 3) {
				System.out.print("[수정] 값 입력 :");
				int num = scan.nextInt();
				
				int index = -1;
				for(int i=0; i<vector.size(); i++) {
					if(num == vector.get(i)) {
						index = i;
						break;
					}
				}
				
				if(index == -1) {
					System.out.println("해당 값은 존재하지 않습니다.");
				}else {
					System.out.print("[교체] 값 입력 :");
					int change = scan.nextInt();
					
					vector.set(index, change);
				}
			}
		}
	}
}
