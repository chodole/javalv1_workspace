package 생성자_개념;

import java.io.FileWriter;
import java.io.IOException;

class Test05{
	//생성자에 예외처리를 해놓으면 객체생성(new) 할때 try()catch()를 반드시 해줘야한다
	Test05() throws Exception{
		
	}
}

public class 생성자_개념06_기본이론6 {
	public static void main(String[] args) {
		try {
			Test05 t6 = new Test05();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter("aaa.text");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
