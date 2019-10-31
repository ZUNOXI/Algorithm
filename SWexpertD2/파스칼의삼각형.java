package SWexpertD2;

import java.util.Scanner;

public class 파스칼의삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int N = scn.nextInt();
			int Q = 2*N-1;
			int [][] arr = new int[N][Q];
			for(int x = 0; x<N; x++) {
				for(int y = 0; y>Q; y++) {
					arr[x][y] = 0;
				}
			}
			arr[0][Q/2] = 1;
			
			for(int x = 1; x<N; x++) {
				for(int y = 0; y<Q; y++) {
					if(y==0) {
						arr[x][y]=arr[x-1][y+1];
					}
					else if(y==(Q-1)) {
						arr[x][y] = arr[x-1][y-1];
					}
					else {
						arr[x][y] = arr[x-1][y+1]+arr[x-1][y-1];
					}
				}
			}
			
			System.out.println("#"+(i+1));
			for(int x = 0; x<N; x++) {
				for(int y = 0; y<Q; y++) {
					if(arr[x][y]!=0) {
						System.out.print(arr[x][y]+" ");
					}
				}
				System.out.println();
			}
		}
	}

}
