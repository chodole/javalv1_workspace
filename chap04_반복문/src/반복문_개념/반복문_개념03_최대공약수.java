package 반복문_개념;

/*
[문제]
	6과 8의 최대공약수를 구하시오.
	최대 공약수란, 위 두 수의 공통인 약수 중에 가장 큰 수를 의미한다.
	
	예)
		6의 약수는 1, 2, 3, 6 이다.
		8의 약수는 1, 2, 4, 8 이다.
		
		6과 8의 공약수는 1, 2 이다.
		6과 8의 최대공약수는 2 이다.
[정답]
	2
*/

public class 반복문_개념03_최대공약수 {
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 8;
		
		int max = 0;
		
		for(int i=1;i<=num1;i++) {
			if(num1%i==0 && num2%i==0) {
				if(max<i) {
					max = i;
				}
			}
		}
		
		System.out.println(max);
	}
}
