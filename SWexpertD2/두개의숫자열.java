package SWexpertD2;

import java.util.Scanner;

public class 두개의숫자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int N = scn.nextInt();
			int M = scn.nextInt();
			int[]narr = new int[N];
			int[]marr = new int[M];
			for(int j = 0; j<N; j++) {
				narr[j] = scn.nextInt();
			}
			for(int j = 0; j<M; j++) {
				marr[j] = scn.nextInt();
			}
			int c = 0;
			int max = 0;
			int sum;
			if(M>N) {
				while(true) {
					sum = 0;
					int cntn = 0;
					for(int x = c; x<N+c; x++) { 
						sum = sum + marr[x]*narr[cntn];
						cntn++;
					}
					if(sum>max) {
						max = sum;
					}
					if(c+1>M-N) {
						break;
					}
					else {
						c++;
						}
					}	
				}
			else if(N>M) {
				while(true) {
					sum = 0;
					int cntn = 0;
					for(int x = c; x<M+c; x++) { 
						sum = sum + marr[cntn]*narr[x];
						cntn++;
					}
					if(sum>max) {
						max = sum;
					}
					if(c+1>N-M) {
						break;
					}
					else {
						c++;
						}
					}	
				}
			System.out.println("#"+(i+1)+" "+max);
		}
	}

}
