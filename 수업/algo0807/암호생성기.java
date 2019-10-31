package algo0807;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 암호생성기 {
	
	public static void main(String[] args) {
		Queue<Integer>queue = new LinkedList<>();
		Scanner scn  = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			int n = scn.nextInt();
			int cnt = 1;
			for(int j = 0; j<8; j++) {
				queue.add(scn.nextInt());
			}
			while(true) {
				int c = 0;
				for(int x = 1; x<6; x++) {
					if(queue.peek()-x>0) {
						queue.add(queue.poll()-x);
					}
					else {
						queue.poll();
						queue.add(0);
						c = 1;
						break;
					}
				}
				if(c==1) {
					break;
				}
			}
			System.out.print("#"+(i+1)+" ");
			for(int j = 0; j<8; j++) {
				System.out.print(queue.poll()+" ");
			}
			System.out.println();
		}
	}

}
