package 콜렉션응용_개념;

import java.util.ArrayList;

class Manager1to50Ver2{
	public ArrayList<ArrayList<Node1to50>> nodeList;
	public int data[][];
	public final int SIZE = 5;
	public void dataInit() {
		data = new int[SIZE][SIZE];
		int num = 1;
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				data[i][j] = num;
				num++;
			}
		}
	}
	
	public void dataShuffle() {}
	public void nodeInit() {
		nodeList = new ArrayList<>();
		
		for(int i=0; i<SIZE; i++) {
			ArrayList<Node1to50> temp = new ArrayList<>();
			for(int j=0; j<SIZE; j++) {
				Node1to50 node = new Node1to50();
				node.num = data[i][j];
				temp.add(node);
			}
			nodeList.add(temp);
		}
	}
	
	public void printNodeList() {
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				nodeList.get(i).get(j).printNode();
			}
			System.out.println();
		}
	}
	
	public void init() {
		dataInit();
		dataShuffle();
		nodeInit();
		printNodeList();
	}
}

public class 콜렉션종류_기본이론8_이차원벡터2 {
	public static void main(String[] args) {
		Manager1to50Ver2 nm = new Manager1to50Ver2();
		nm.init();
	}
}
