package 인터페이스_개념;

class TestA{
	void test() {}
}

class TestB extends TestA{}

abstract class TestC{
	abstract void test();
	void test2() {};
}

class TestD extends TestC{
	@Override
	void test() {}
}

interface TestE{
	public void test();
	public void test2();
}

interface TestE2{
	public void test3();
}

class TestF implements TestE, TestE2{

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
}

public class 인터페이스_개념01_기본이론1 {
	public static void main(String[] args) {
		
	}
}
