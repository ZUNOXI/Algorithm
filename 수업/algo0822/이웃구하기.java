package algo0822;

import java.util.Scanner;

public class 이웃구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [][] arr = new int [n][n];
		for(int x = 0; x<n; x++) {
			for(int y = 0; y<n; y++) {
				arr[x][y]=scn.nextInt();
			}
		}
		int cntall = 0;
		for(int x = 1; x<n-1; x++) {
			for(int y = 1; y<n-1; y++) {
				int cnt = 0;
				if(arr[x][y]>arr[x-1][y]) {
					cnt ++;
				}
				if((arr[x][y]>arr[x][y-1])) {
					cnt++;
				}
				if((arr[x][y]>arr[x+1][y])) {
					cnt++;
				}
				if((arr[x][y]>arr[x][y+1])) {
					cnt++;
				}
				if((arr[x][y]>arr[x-1][y-1])){
					cnt++;
				}
				if(arr[x][y]>arr[x+1][y+1]) {
					cnt++;
				}
				if(arr[x][y]>arr[x-1][y+1]) {
					cnt++;
				}
				if(arr[x][y]>arr[x+1][y-1]) {
					cnt++;
				}
				if(cnt==8) {
					cntall++;
				}
			}
		}
		System.out.println(cntall);
	}

}
