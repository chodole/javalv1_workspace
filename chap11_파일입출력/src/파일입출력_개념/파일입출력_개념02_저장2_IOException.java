package 파일입출력_개념;

import java.io.FileWriter;
import java.io.IOException;

public class 파일입출력_개념02_저장2_IOException {
	public static void main(String[] args) {
		String fileName = "src/파일입출력_개념/file02.txt";
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName);
			fw.write("김철수,10\n이영희,30\n박만수,50");
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
