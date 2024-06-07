package 콜렉션응용_개념;

import java.util.ArrayList;
import java.util.Scanner;

public class 콜렉션종류_기본이론2_어레이리스트2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			System.out.println(list);
			System.out.println("1.추가 2.삭제 3.삽입 4.종료");
			
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("추가할 숫자를 입력하세요 >>");
				int num = scan.nextInt();
				list.add(num);
			}else if(sel == 2) {
				System.out.println(list);
				System.out.println("삭제할 인덱스를 입력하세요 >>");
				int index = scan.nextInt();
				
				if(list.size() <= 0) {
					continue;
				}
				if(index < 0) {
					continue;
				}
				if(index >= list.size()) {
					continue;
				}
				list.remove(index);
			} else if(sel == 3) {
				System.out.println(list);
				System.out.println("삽입할 위치를 입력하세요 >>");
				int pos = scan.nextInt();
				System.out.println("삽입할 값을 입력하세요 >>");
				int value=scan.nextInt();
				list.add(pos,value);
			}else if(sel == 4) {
				System.out.println("종료");
				break;
			}
		}
		
		scan.close();
	}
}
