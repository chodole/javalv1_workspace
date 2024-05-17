package 생성자_개념;

import java.util.Vector;

class Member{
	int number;
	String name;
	
	void init(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	Member(){}
	Member(int number, String name){
		this.name = name;
		this.number = number;
	}
}

//DAO = Data Access Object
class MemberDAO{
	Vector<Member> memberList = new Vector<Member>();
	
	void memberInsert(Member member) {
		memberList.add(member);
	}
	
	void printMemberList() {
		System.out.println("------------------");
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(memberList.get(i).number+", "+memberList.get(i).name);
		}
		System.out.println("------------------");
	}
}

public class 생성자_개념01_기본이론1 {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		for(int i=0; i<10; i++) {
			Member member = new Member();
			//init 메서드
			member.init(1000+i, "aaaa"+i);
			dao.memberInsert(member);
		}
		dao.printMemberList();
		
		dao = new MemberDAO();
		for(int i=0; i<10; i++) {
			//생성자
			Member member= new Member(1000+i, "bbbb"+i);
			dao.memberInsert(member);
		}
		dao.printMemberList();
	}
}
