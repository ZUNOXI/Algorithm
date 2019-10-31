package SWexpertD2;

import java.util.Scanner;

public class 간단한369게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int N = scn.nextInt();
		for(int i = 1; i<N+1; i++) {
			int cnt = 0;
			if(i%10==3 || i%10==6 || i%10==9) {
				System.out.print("-");
				cnt ++;
			}
			if(i/10==3 || i/10==6 || i/10==9) {
				System.out.print("-");
				cnt ++;
			}
			if(cnt==0) {
				System.out.print(i);
				}
			System.out.print(" ");
			}
		}
	}

