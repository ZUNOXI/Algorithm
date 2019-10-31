package SWexpertD3;

import java.util.Scanner;

public class nqueenself {
	static Scanner scn = new Scanner(System.in);
	static int result;
	static int n;
	static int [] col;
	
	
	public static void main(String[] args) {
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			n = scn.nextInt();
			result = 0;
			col = new int[11];
			for(int j = 1; j<=n; j++) {
				col[1]=j;
				dfs(1);
			}
			System.out.println("#"+(i+1)+" "+result);
		}
		
	}
	
	public static void dfs(int row) {
		if(row==n) {
			result++;
		}
		else {
			for(int i = 1; i<=n; i++) {
				col[row+1] = i;
				if(isPossible(row+1)) {
					dfs(row+1);
				}
				else {
					col[row+1]=0;
				}
			}
		}
		col[row]=0;
	}
	
	public static void isPossible(int c) {
		
	}
	
	
}
