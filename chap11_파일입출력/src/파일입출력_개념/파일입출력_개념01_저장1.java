package 파일입출력_개념;

import java.io.FileWriter;

public class 파일입출력_개념01_저장1 {
	public static void main(String[] args) {
		// 세이브 파일 만들기 
		// 1) 변수생성          	==>  FileWriter fw = null; 
		// 1) 파일 생성          	==>  fw = new FileWriter("파일이름"); 
		// 2) 파일에 내용 저장 		==>  fw.write(저장할내용);
		// 3) 파일닫기           	==>  fw.close(); 
		
		String fileName = "file01.txt";
		FileWriter fw = null; //try밖에서 사용을 위해 보통 밖에 변수를 둔다
		
		try {
			fw = new FileWriter(fileName);
			fw.write("김철수,10\n이영희,30\n박만수,50");
			
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 1. Run : Ctrl + F11
		// 2. 프로젝트 선택 후, 
		//    F5(Refresh)를 누르면 생성된 메모장 파일을 확인할 수 있다.
	}
}
