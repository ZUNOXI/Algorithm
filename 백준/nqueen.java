package 백준;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class nqueen {
	static int cnt, n;
	static int[][] arr;
	static boolean zx = false;
	static boolean [][] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		n = Integer.parseInt(s);
		arr = new int[n][n];
		visited = new boolean[n][n];
		cnt = 0;
		for(int k = 0; k<n; k++) {
			arr[0][k]=1;dfs(1);arr[0][k]=0;
		}
		System.out.println(cnt);
	}
	
	public static void dfs(int x) {
		if(checkcnt()) {
			cnt++;
			return;
		}
		for(int i = 0; i<n; i++) {
			if(!visited[x][i] && !(check(x, i))) {
					arr[x][i] = 1;
					visited[x][i] = true;
					dfs(x+1);
					arr[x][i]=0;
					visited[x][i]=false;
			}
		}
	}
	public static boolean checkcnt() {
		int cntq = 0;
		for(int x = 0; x<n; x++) {
			for(int y = 0; y<n; y++) {
				if(arr[x][y]==1) {
					cntq++;
				}
			}
		}
		if(cntq==n) {
			return true;
		}
		return false;
	}
	
	public static boolean check(int x, int y) {
		for(int z = 0; z<n; z++) { // 가로 검사 
			if(arr[x][z]==1) {
				return true;
			}
		}
		for(int z = 0; z<n; z++) { // 세로 검사 
			if(arr[z][y]==1) {
				return true;
			}
		}
		for(int z = x, z1 = y; z>-1 && z1>-1; z--,z1--) { // 좌상
			if(arr[z][z1]==1) {
				return true;
			}
		}
		for(int z = x, z1 = y; z<n && z1>-1; z++,z1--) { // 좌하
			if(arr[z][z1]==1) {
				return true;
			}
		}
		for(int z = x, z1 = y; z<n && z1<n; z++,z1++) { // 우하
			if(arr[z][z1]==1) {
				return true;
			}
		}
		for(int z = x, z1 = y; z>-1 && z1<n; z--,z1++) { // 우상
			if(arr[z][z1]==1) {
				return true;
			}
		}
		return false;
	}
}
