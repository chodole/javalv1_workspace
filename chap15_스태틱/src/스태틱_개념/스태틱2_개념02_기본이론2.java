package 스태틱_개념;

import java.util.Vector;

class Member{
	public int num;
	public String name;
}

class MemberDAO{
	public static MemberDAO instance = new MemberDAO();
	public Vector<Member> memberList;
	
	public MemberDAO() {
		memberList = new Vector<Member>();
	}
	public void create() {};
	public void read() {};
	public void update() {};
	public void delete() {};
}

class Controller{
	static Controller instance = new Controller();
	
	void run() {
		while(true) {
			int sel = 0;
			if(sel == 1) {
				MemberDAO.instance.create();
			}else if(sel == 2) {
				MemberDAO.instance.read();
			}
		}
	}
}

public class 스태틱2_개념02_기본이론2 {
	public static void main(String[] args) {
		Controller.instance.run();
	}
}
