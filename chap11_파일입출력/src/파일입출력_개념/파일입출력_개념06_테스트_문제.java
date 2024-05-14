package 파일입출력_개념;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class 파일입출력_개념06_테스트_문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nameData = "김철수,이만수,이영희";
		String ageData ="20,30,40";
		String fileName ="src/파일입출력_개념/file04.txt";
		String data = "";
		
		String[] nameList = null;
		int[] ageList = null;
		
		FileWriter fw = null;
		FileReader fr = null;
		
		while(true) {
			System.out.println("[0]종료 [1]저장 [2]로드");
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {
				String[] nameSample = nameData.split(",");
				String[] ageSample =ageData.split(",");
				
				try {
					data = "";
					fw = new FileWriter(fileName);
					
					for(int i=0; i<nameSample.length; i++) {
						data+=nameSample[i];
						data+=",";
						data+=ageSample[i];
						data+="\n";
					}
					data = data.substring(0,data.length()-1);
					fw.write(data);
					fw.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println(data);
			}else if(sel == 2) {
				data = "";
				
				try {
					fr = new FileReader(fileName);
					while(true) {
						int read = fr.read();
						if(read != -1) {
							data += (char)read;
						}else {
							break;
						}
					}
					fr.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				System.out.println(data);
				
				String[] token = data.split("\n");
				int size = token.length;
				
				nameList = new String[size];
				ageList = new int[size];
				
				for(int i=0; i<size; i++) {
					String[] token2 = token[i].split(",");
					nameList[i] = token2[0];
					ageList[i] = Integer.parseInt(token2[1]);
				}
				
				System.out.println("----------------------------------");
				
				for(int i=0; i<size; i++) {
					System.out.println(nameList[i] +" "+ageList[i]);
				}
			}
		}
	}
}
