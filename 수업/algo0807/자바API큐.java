package algo0807;

import java.util.LinkedList;
import java.util.Queue;

public class 자바API큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();
		
		//넣기
		queue.add("삽입");
		//빼기
		System.out.println( queue.poll() );
		//안뺴고 다음 빠질거 확인만
		System.out.println( queue.peek() );
	}

}
