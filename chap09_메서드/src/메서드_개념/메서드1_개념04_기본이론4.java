package 메서드_개념;

class Calculation{
	double num1;
	double num2;
	double result;
	
	// 매서드는 모두 독립공간이라서 갈색으로 표시된 변수들은 중복이되어도 전부 다른 변수이다.
	// double a, double b  은 4번이나 사용하지만 각각다른변수이다. 
		
	//		  매개변수 = parameter
	void plus() {
		System.out.println("this = "+this);
		
		//this는 생략가능하다.
		//this.result = this.num1 + this.num2;
		result = num1+num2;
	}
	
	void minus(double a, double b) {
		this.result = a - b; 
	}
	void multiply(double a, double b) {
		result = a*b;
	}
	void division(double a, double b) {
		result = a / b;
	}
	void printResult() {
		System.out.println(result);
	}
}

public class 메서드1_개념04_기본이론4 {
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		System.out.println("cal ="+cal);
		
		double a = 10;
		double b = 3;
		
		cal.num1 = a;
		cal.num2 = b;
		cal.plus();
		cal.printResult();
		
		cal.minus(a, b);
		cal.printResult();
		
		cal.multiply(a, b);
		cal.printResult();
		
		cal.division(a, b);
		cal.printResult();
	}
}
