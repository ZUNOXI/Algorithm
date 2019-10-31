package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다리만들기2 {
	static int [][] arr;
	static boolean [][] visited;  
	static int cnt;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int [N+2][M+2];
		for(int x = 1; x<N+1; x++) {
			String str = br.readLine();
			st = new StringTokenizer(str);
			for(int y = 1; y<M+1; y++) {
				arr[x][y] = Integer.parseInt(st.nextToken());
			}
		}
		cnt = 1;
		visited = new boolean[N+2][M+2];
		for(int x = 1; x<N+1; x++) {
			for(int y = 1; y<M+1; y++) {
				if(arr[x][y]==1 && !visited[x][y]) {
					dfs(x,y);
					cnt++;
				}
			}
		}
		for(int x = 1; x<N+1; x++) {
			for(int y = 1; y<M+1; y++) {
				System.out.print(arr[x][y]+" ");
				}
			System.out.println();
			}
		}
	static int [] dx = {1,-1,0,0};
	static int [] dy = {0,0,1,-1};
	
	public static void dfs(int x, int y) {
		arr[x][y]=cnt;
		visited[x][y] = true;
		for(int i = 0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(arr[nx][ny]==1 && !visited[nx][ny]) {
				dfs(nx,ny);
			}
		}
	}

}
