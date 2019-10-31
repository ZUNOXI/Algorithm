package D3;

import java.util.Scanner;

public class 회문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			int N = scn.nextInt();
			char[][]arr = new char[8][8];
			for(int x = 0; x<8; x++) {
				String s = scn.next();
				for(int y = 0; y<8; y++) {
					arr[x][y] =s.charAt(y);
				}
			}
			int c1 = 0;
			int mid = N/2;
			int cntr = 0;
			for(int x = 0; x<8; x++) {
				for(int y = 0; y<8-N+1; y++) {
					int start = y;
					int end = N+y-1;
					int cnt = 0;
					while(true) {
						if(start >= end) {
							break;
						}
						if(arr[x][start]==(arr[x][end])) {
							cnt++;
						}
						start++;
						end--;
					}
					if(cnt==mid) {
						cntr++;
						}
					}
					
				}
			for(int y = 0; y<8; y++) {
				for(int x = 0; x<8-N+1; x++) {
					int start = x;
					int end = N+x-1;
					int cnt = 0;
					while(true) {
						if(start >= end) {
							break;
						}
						if(arr[start][y]==(arr[end][y])) {
							cnt++;
						}
						start++;
						end--;
					}
					if(cnt==mid) {
						cntr++;
						}
					}
				}
			System.out.println("#"+(i+1)+" "+cntr);
			}
			
			
			
			
		}
	}
