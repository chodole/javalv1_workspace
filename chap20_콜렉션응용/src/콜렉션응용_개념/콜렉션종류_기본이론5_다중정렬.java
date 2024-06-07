package 콜렉션응용_개념;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int num;
	String name;
	int score1;
	int score2;
	
	Student(int num, String name, int score1, int score2){
		this.num = num;
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	public String toString() {
		String print = String.format("%d %s %d %d", num, name, score1, score2);
		return print;
	}
}

class DownCompare implements Comparator<Student>{
	int ret = 0;

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.score1 < s2.score1) {
			ret = 1;
		}else if(s1.score1 == s2.score1) {
			if(s1.score2 < s2.score2) {
				ret = 1;
			}else if(s1.score2 == s2.score2) {
				ret = 0;
			}else if(s1.score2 > s2.score2) {
				ret = -1;
			}
		}else if(s1.num > s2.num) {
			ret = -1;
		}
		
		return ret;
	}
}

class UpCompare implements Comparator<Student>{
	int ret = 0;

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.score1 < s2.score1) {
			ret = -1;
		}
		else if (s1.score1 == s2.score1) {
			
			if(s1.score2 < s2.score2) {
				ret = -1;
			}
			else if(s1.score2 == s2.score2) {
				ret = 0;
			}
			else if(s1.score2 > s2.score2) {
				ret = 1;
			}
			
		}
		else if (s1.num > s2.num) {
			ret = 1;
		}
		return ret;
	}
}

public class 콜렉션종류_기본이론5_다중정렬 {
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		Student s1 = new Student(11001244, "아무개" , 10, 20);
		Student s2 = new Student(25109435, "김김김" , 50, 90);
		Student s3 = new Student(11005338, "사이다" , 40, 30);
		Student s4 = new Student(11005338, "박박박" , 40, 20);
		Student s5 = new Student(11005338, "오오오" , 10, 80);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		//정렬을 종류별로 다양하게 만들 수 있다.
		Collections.sort(list, new DownCompare());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
		Collections.sort(list, new UpCompare());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
