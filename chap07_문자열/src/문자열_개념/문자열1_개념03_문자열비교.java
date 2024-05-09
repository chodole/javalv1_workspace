package 문자열_개념;

public class 문자열1_개념03_문자열비교 {
	public static void main(String[] args) {
		String str1 = "가";
		String str2 = "나";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);
		
		String str3 = "가";
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);
	}
}
