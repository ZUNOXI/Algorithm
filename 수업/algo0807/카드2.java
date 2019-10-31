package algo0807;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int n = scn.nextInt();
		
		for(int i = 1; i<n+1; i++) {
			queue.add(i);
		}
		while(true) {
			if(queue.size()==1) {
				System.out.println(queue.peek());
				break;
			}
			queue.poll();
			queue.add(queue.poll());
		}
	}
}
