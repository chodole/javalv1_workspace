package 스태틱_개념;

import java.util.Vector;

class User{
	String name;
}

class UserDAO{
	static UserDAO instance = new UserDAO();
	
	Vector<User> userList = new Vector<User>();
	void insert() {};
	void remove() {};
	void update() {};
	void print() {};
}

class Sub{
	String name;
	String userName;
}

class SubDAO{
	static Vector<Sub> subList = new Vector<Sub>();
	
	static void insert() {
		UserDAO.instance.userList.get(0);
		Vector<User> userList = UserDAO.instance.userList;
		userList.get(0);
		
		int arr[][]  = {{1},{1},{1}};
		arr[0][0] = 10;
		
		int temp[] = arr[0];
		temp[0] = 10;
	}
	
	static void remove() {};
	static void update() {};
	static void print() {};
}

public class 스태틱2_개념01_기본이론1 {
	public static void main(String[] args) {
		
	}
}
