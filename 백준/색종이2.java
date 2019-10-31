package 백준;

import java.util.Scanner;

public class 색종이2 {
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int [][] arr = new int [101][101];
	for(int i = 0; i<n; i++) {
		int a = scn.nextInt();
		int b = scn.nextInt();
		for(int x = b; x<b+10; x++) {
			for(int y = a; y<a+10; y++) {
				if(arr[x][y]!=1) {
					arr[x][y]=1;
				}
			}
		}
		
	}
	int cnt = 0;
	for(int x = 1; x<101; x++) {
		for(int y = 1; y<101; y++) {
			if((arr[x][y]==1) && ((arr[x+1][y]==0) || (arr[x-1][y]==0))) {
				cnt++;
			}
			if((arr[x][y]==1) && ((arr[x][y+1]==0) || (arr[x][y-1]==0))) {
				cnt++;
			}
		}
	}
	System.out.println(cnt);
	}
}
