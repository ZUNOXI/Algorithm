package algo0807;

import java.util.Scanner;

public class 원형큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]queue = new int[3];
		int front = 0;
		int rear = 0;
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("1.enQueue\n2.deQueue\n3.isEmpty\n0.End");
			int Sel = scn.nextInt();
			if(Sel == 1 ) {
				if(!((front%3)==((rear+1)%3))) {
					int num = scn.nextInt();
					rear = (rear+1)%3;
					queue[rear] = num;
				}
				else {
					System.out.println("full!");
				}
			}
			else if(Sel == 2) {
				if(front == rear) {
					System.out.println("공백");
				}
				else {
				front = (front+1)%3;
				System.out.println(queue[front]);
				}
			}
			
			else if(Sel == 0) {
				break;
			}
		}
	}

}
