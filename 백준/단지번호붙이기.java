package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 단지번호붙이기 {
	static int[][]arr;
	static boolean[][]visited;
	static ArrayList<Integer>list;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+2][n+2];
		for(int x = 1; x<n+1; x++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			for(int y = 1; y<n+1; y++) {
				arr[x][y]=Integer.parseInt(st.nextToken());
			}
		}
		cnt =2;
		for(int x = 1; x<n+1; x++) {
			for(int y = 1; y<n+1; y++) {
				if(arr[x][y]==1) {
					dfs(x,y);
					cnt++;
				}
			}
		}
		for(int x = 1; x<n+1; x++) {
			for(int y = 1; y<n+1; y++) {
				System.out.println(arr[x][y]);
				}
			}
		}

	static int[]dx= {1,-1,0,0};
	static int[]dy= {0,0,1,-1};
	static int cnt = 0;
	
	public static void dfs(int x, int y) {
		visited[x][y]=true;
		for(int i = 0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(arr[nx][ny]==1&&!(visited[nx][ny])) {
				arr[nx][ny]=cnt;
				dfs(nx,ny);
			}
		}
	}

}
