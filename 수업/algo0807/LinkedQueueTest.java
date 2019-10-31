package algo0807;

class LinkedQueue{
	
	Node front;
	Node rear;
	void enQueue(int data) {
		Node n = new Node();
		n.data = data;
		//front가  nill이면 빈큐
		if(front==null) {
			//빈큐이면 새로운 노드객체를 front와 rear가 참조
			front = n;
			rear = n;			
		}
		else {
			//빈큐가 아니면
			//새로운 노드객체를 생성하고 현재 rear의 
			rear.links = n;
			rear = n;
		}
	}
	int deQueue(){
		// front가 null이면 빈큐라서 인출못함(-1리턴)
		if(front==null) {
			return -1;
		}
		int data = front.data;
		front = front.links;
		if(front == null) {
			rear = null;
		}
		return data;
	} 
	
	static class Node{
		int data;
		Node links;
	}	
}

public class LinkedQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedQueue lq = new LinkedQueue();
		lq.enQueue(10);
		lq.enQueue(20);
		System.out.println(lq.deQueue());
		System.out.println(lq.deQueue());
		System.out.println(lq.deQueue());
	}

}
