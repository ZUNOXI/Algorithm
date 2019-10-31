package algo0822;

import java.util.Scanner;

public class nqueentest {
	static int [][] col;
	static int cntall;
	static int n;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			n = scn.nextInt();
			col = new int[n+1][n+1];
			cntall = 0;
			for(int j = 1; j<=n; j++) {
				col[1][j]=1;
				dfs(1);
			}
			System.out.println("#"+(i+1)+" "+cntall);
		}
	}
	
	public static void dfs(int row) {
		if(row == n) {
			cntall++;
		}
		else {
			for(int i = 1; i<=n; i++) {
				col[row+1][i]=1;
				if(isPossible(row+1)) {
					dfs(row+1);
				}
				else {
					col[row+1][i]=0;
				}
			}
		}
		col[row][i]=0;
	}
	
	public static boolean isPossible(int c) {
		for(int i = 1; i<c; i++) {
			if(col[c]==col[i]) {
				return false;
			}
			if(Math.abs(col[c]-col[i])==Math.abs(c-i)) {
				return false;
			}
		}		
		return true;
	}

}
