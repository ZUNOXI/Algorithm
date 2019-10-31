package D3;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			int n = scn.nextInt();
			int[][]arr = new int[100][100];
			for(int x = 0; x<100; x++) {
				for(int y = 0; y<100; y++) {
					arr[x][y] = scn.nextInt();
				}
			}
			int sum = 0;
			int max = 0;
			for(int x = 0; x<100; x++) {
				sum = 0;
				for(int y = 0; y<100; y++) {
					sum = sum + arr[x][y];
				}
				if(sum>max) {
					max = sum;
				}
			}
			for(int y = 0; y<100; y++) {
				sum = 0;
				for(int x = 0; x<100; x++) {
					sum = sum + arr[x][y];
				}
				if(sum>max) {
					max = sum;
				}
			}
			sum = 0;
			int c = 0;
			while(c<100) {
					sum = sum + arr[c][c];
					c++;		
				}
			if(sum>max) {
				max = sum;
			}
			sum = 0;
			c = 0;
			
			while(c<100) {
					sum = sum + arr[99-c][c];
					c++;		
				}
				if(sum>max) {
					max = sum;
			}
			System.out.println("#"+(i+1)+" "+max);
		}
		
	}

}
