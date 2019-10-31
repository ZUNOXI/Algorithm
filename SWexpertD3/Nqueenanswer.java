package SWexpertD3;

import java.util.Scanner;

public class Nqueenanswer {
		static Scanner scn = new Scanner(System.in);
		static int n, result;
		static int [] col;
		
		public static void main(String[] args) {
			int t = scn.nextInt();
			for(int i = 0; i<t; i++) {
				n = scn.nextInt();
				result = 0;
				col = new int[15];
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
					col[row+1]=i;
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
		
		public static boolean isPossible(int c) {
			for(int i = 1; i<c; i++) {
				if(col[i]==col[c]) {
					return false;
				}
				if(Math.abs(col[i]-col[c])==Math.abs(i-c)) {
					return false;
				}
			}
			return true;
		}
	}
