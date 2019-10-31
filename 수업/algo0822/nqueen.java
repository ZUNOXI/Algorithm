package algo0822;

import java.util.Arrays;
import java.util.Scanner;

public class nqueen {
	static int n;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		int[][]map = new int [n][n];
		cnt = 0;
		backtrack(map,0);
		System.out.println(cnt);		
	}
	
	
	static int cnt = 0;
	
	static void backtrack(int [][]map,int idx) {
		if(idx==map.length) {
			cnt++;
			return;
		}
		for(int i = 0; i<map[idx].length; i++) {
			map[idx][i] = 1;
			backtrack(map,idx+1);
			map[idx][i] = 0;
		}
	}

}

/**
int cntq = 0;
for(int x = 0; x<n; x++) {
	int cntx = 0;
	for(int y = 0; y<n; y++) {
		if(map[x][y]==1) {
			cntx++;
		}
	}
	if(cntx==1) {
		cntq = 1;
	}
	else {
		cntq = 0;
	}
}
for(int y = 0; y<n; y++) {
	int cntx = 0;
	for(int x = 0; x<n; x++) {
		if(map[x][y]==1) {
			cntx++;
		}
	}
	if(cntx==1) {
		cntq = 1;
	}
	else {
		cntq = 0;
	}
}
int k = 1;
while(k<n) {
	int cntx = 0;
	for(int x = 0,y = k; x<=k && y>-1; x++, y--) {
		if(map[x][y]==1) {
			cntx++;
		}
	}
	if(cntx<=1) {
		cntq = 1;
	}
	else {
		cntq = 0;
	}
	k++;
}
**/
