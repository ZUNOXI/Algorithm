package algo0807;

import java.util.Scanner;

public class 선형큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []queue = new int[10];
		int front = -1;
		int rear = -1;
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("1.enQueue\n2.deQueue\n3.isEmpty\n0.End");
			int Sel = scn.nextInt();
			if(Sel == 1 ) {
				int num = scn.nextInt();
				rear++;
				queue[rear] = num;
			}
			else if(Sel == 2) {
				front++;
				System.out.println(queue[front]);
			}
			
			else if(Sel == 3) {
				if(front == rear) {
					System.out.println("공백");
				}
			}
			
			else if(Sel == 0) {
				break;
			}
		}
	}

}
