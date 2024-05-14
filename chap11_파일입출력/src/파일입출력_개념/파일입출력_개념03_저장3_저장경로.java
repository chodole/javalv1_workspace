package 파일입출력_개념;

import java.io.FileWriter;

public class 파일입출력_개념03_저장3_저장경로 {
	public static void main(String[] args) {
		
		String fileName = "src/파일입출력_개념/file03.txt"; // 경로를지정하면  폴더에 저장가능
		FileWriter fw = null; 
		try {
			fw = new FileWriter(fileName);
			fw.write("김철수,10\n이영희,30\n박만수,50");
            fw.close();
		}catch(Exception e) { // Exception 을 사용해도되고 IOException 을사용해도된다.
			e.printStackTrace();
		}
		
	}
}
