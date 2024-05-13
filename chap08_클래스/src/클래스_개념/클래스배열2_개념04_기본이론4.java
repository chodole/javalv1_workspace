package 클래스_개념;

import java.util.Arrays;

public class 클래스배열2_개념04_기본이론4 {
	public static void main(String[] args) {
		String data = "";
		data+="1001,qwer,1234,김철민,10\n";
		data+="1002,asdf,2345,우중현,3\n";
		data+="1003,zxcv,3456,이만수,30";
		
		System.out.println(data);
		String[] token = data.split("\n");
		System.out.println(Arrays.toString(token));
		
		Member1[] memberList = null;
		int size = token.length;
		memberList = new Member1[size];
		
		for(int i=0; i<size; i++) {
			String[] token2 = token[i].split(",");
			
			memberList[i] = new Member1();
			
			memberList[i].number = Integer.parseInt(token2[0]);
			memberList[i].id = token2[1];
			memberList[i].pw = token2[2];
			memberList[i].name = token2[3];
			memberList[i].score = Integer.parseInt(token2[4]);
		}
		
		int max = memberList[0].score;
		String name =memberList[0].name;
		for(int i=0; i<memberList.length; i++) {
			if(memberList[i].score > max) {
				max = memberList[i].score;
				name = memberList[i].name;
			}
		}
		
		System.out.println(name);
	}
}
