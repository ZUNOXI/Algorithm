package SWexpertD2;

import java.util.Scanner;

public class 어디에단어가들어갈수있을까 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int tc = scn.nextInt();
		for(int i = 0; i<tc; i++) {
			int N = scn.nextInt();
			int k = scn.nextInt();
			int result = 0;
			int [][] arr = new int[N][N];
			for(int x = 0; x<N; x++) {
				for(int y = 0; y<N; y++) {
					arr[x][y] = scn.nextInt();
				}
			}
			for(int x = 0; x< N; x++) {  // 가로 
				for(int z = 0; z<N-k+1; z++) {
					int cnt = 0;
					if(z>0 && arr[x][z-1]!=1) {
						for(int y = z; y<N; y++) {
							if(arr[x][y]==1) {
									cnt++;
							}
							else {
								break;
							}
						}
						if(cnt==k) {
								result++;
							}
						}
					else if(z==0) {
						for(int y = z; y<N; y++) {
							if(arr[x][y]==1) {
									cnt++;
							}
							else {
								break;
							}
						}
						if(cnt==k) {
								result++;
							}
						}
					}
				}
			for(int y = 0; y< N; y++) { // 세로
				for(int z = 0; z<N-k+1; z++) {
					int cnt = 0;
					if(z>0 && arr[z-1][y]!=1) {
						for(int x = z; x<N; x++) {
							if(arr[x][y]==1) {
									cnt++;
							}
							else {
								break;
							}
						}
						if(cnt==k) {
								result++;
							}
						}
					else if(z==0) {
						for(int x = z; x<N; x++) {
							if(arr[x][y]==1) {
									cnt++;
							}
							else {
								break;
							}
						}
						if(cnt==k) {
								result++;
							}
						}
					}
				}
			System.out.println("#"+(i+1)+" "+result);
		}
	}

}
