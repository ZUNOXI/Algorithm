package algo0808;

import java.util.ArrayList;

import algo0808.MyLinkedList.Node;

class MyLinkedList{
	Node head;
	int size = 0;
	
	void add(int idx, int data) {
		Node tmpn = new Node();
		tmpn.data = data;		
		//idx번째 다음에 data값을 갖는 새로운 노드를 연결
		Node tmp = head;
		for(int i = 0; i<idx; i++) {
			tmp = tmp.link;
		}
		Node tmporiginal = tmp.link;
		tmp.link = tmpn;
		tmpn.link = tmporiginal;
		size++;
		//data값을 갖는 새로운 Node객체를 생성하고
		//idx번째 친구를 찾아와서. (맨첨이나 맨끝이 아니라면)
		//그놈이 갖는 다음위치를 새로운 노등의 다음위치로 지정
		//그놈의 다음위치를 새로운 노드로 지정.
	}
	
	void addToFirst(int data) {
		//새로운 Node객체를 생성해서 data(매개변수)를 data영역에 저장...
		Node tmpn = new Node();
		tmpn.data = data;
		//head가 null이라면 첫 데이터이므로, head에 연결
		if(head==null) {
			head = tmpn;
		}
		//아니라면 새로 만들어진 놈의 link를 head로 연결, head를 새로운 놈으로 지정
		else {
			tmpn.link = head;
			head = tmpn;
		}
		size++;
	}
	
	
	void addToLast(int data) {
		//data를 담는 새로운 Node 객체를 생성
		Node tmpn = new Node();
		tmpn.data = data;
		
		//head가 null이라면 첫 데이터이므로, head에 연결.
		if(head==null) {
			head = tmpn;
		}
		
		//아니라면, head로부터 출발해서 맨 마지막놈을 찾아서 마지막놈의 link에 연결
		else {
			Node tmp = head;
			while(tmp.link!=null) {
//				System.out.println(tmp.data);
				tmp = tmp.link;
			}
			tmp.link = tmpn;
		}
		size++;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node tmp = head;
		while(tmp!=null) {
			sb.append(tmp.data).append(" ");
			tmp = tmp.link;
		}
		return sb.toString();
	}
	
	Node getData(int idx) {
		//idx번째 위치의 data를 리턴.
		if(size<=0 || size <=idx) {
			return null;
		}
		else {
			//head로부터 idx번 만큼 다음으로 이동시킨 후 그 위치의 객체를 리턴
			Node tmp = head;
//			while(idx>0) {
////				System.out.println(tmp.data);
//				tmp = tmp.link;
//				idx--;
//			}
			
			for(int i = 0; i<idx; i++) {
				tmp = tmp.link;
			}
			return tmp;
		}
	}
	
	
	static class Node{
		int data;
		Node link;
	}
}

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		list.addToFirst(10);
		list.addToFirst(20);
		list.addToFirst(30);
		list.addToLast(50);
		System.out.println(list);
		list.add(0, 70);
		System.out.println(list);
		System.out.println(list.getData(0));
//		MyLinkedList.Node n1 = new MyLinkedList.Node();
//		n1.data = 10;
//		
//		MyLinkedList.Node n2 = new MyLinkedList.Node();
//		n2.data = 20;
//		n1.link = n2;
//		
//		MyLinkedList.Node n3 = new MyLinkedList.Node();
//		n3.data = 30;
//		n2.link = n3;
//		
//		MyLinkedList.Node n4 = new MyLinkedList.Node();
//		n4.data = 40;
//		n3.link = n4;
//		
//		n2 = n3 = n4 = null;
		
//		System.out.println(n1.link.link.link.data);
		// n4까지 있다는 사실을 모르는 상태에서 ... n1 부터 시작해서 모든친구들을 출력
//		ArrayList<Node>arr = new ArrayList<>();
//		while(true) {
//			
//			int result = n1.link.data;
//			System.out.println(result);
		
//		MyLinkedList.Node tmp = n1;
//		while(tmp!=null) {
//			System.out.println(tmp.data);
//			tmp = tmp.link;
//		}
	}

}
