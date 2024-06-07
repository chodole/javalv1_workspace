package 콜렉션응용_개념;

import java.util.ArrayList;

class Node1to50{
	public int num;
	
	public void printNode() {
		System.out.print(num + "\t");
	}
}

class Manager1to50{
	public ArrayList<Node1to50[]> nodeList;
	public int data[][];
	public final int SIZE = 5;
	
	public void dataInit() {
		data= new int[SIZE][SIZE];
		int num =1;
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
			Node1to50[] temp = new Node1to50[SIZE];
			for (int j=0;j<SIZE; j++) {
				Node1to50 node = new Node1to50();
				node.num = data[i][j];
				temp[j] = node;
			}
			nodeList.add(temp);
		}
	}
	
	public void printNodeList() {
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				nodeList.get(i)[j].printNode();
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

public class 콜렉션종류_기본이론7_이차원벡터1 {
	public static void main(String[] args) {
		Manager1to50 nm = new Manager1to50();
		nm.init();
	}
}
