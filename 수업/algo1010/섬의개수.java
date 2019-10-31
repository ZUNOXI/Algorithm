package algo1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 섬의개수 {
	static int[][]arr;
	static boolean [][] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		if(h==0 & w==0) {
			break;
		}
		arr =  new int [w+2][h+2];
		for(int x = 1; x<w+1; x++) {
			String str = br.readLine();
			st = new StringTokenizer(str);
			for(int y = 1; y<h+1; y++) {
				int c = Integer.parseInt(st.nextToken());
				if(c == 0) {
					arr[x][y] = 2;
				}
				else {
					arr[x][y] = 1;
				}
			}
		}
		int cnt = 0;
		visited = new boolean[w+2][h+2];
		for(int x = 1; x<w+1; x++) {
			for(int y = 1; y<h+1; y++) {
				if(arr[x][y]==1 && !visited[x][y]) {
					dfs(x,y);
					cnt++;
				}
			}
		}
//		for(int x = 1; x<w+1; x++) {
//			for(int y = 1; y<h+1; y++) {
//				System.out.print(arr[x][y]);
//			}
//			System.out.println();
//		}
		System.out.println(cnt);
		}
	}
	static int[] dx = {1,-1,0,0,-1,-1,1,1};
	static int[] dy = {0,0,-1,1,-1,1,-1,1};
	public static void dfs(int a, int b) {
		visited[a][b]=true;
		for(int i = 0; i<8; i++) {
			int nx = a + dx[i];
			int ny = b + dy[i];
			if(arr[nx][ny]==1 && !visited[nx][ny]) {
				dfs(nx,ny);
			}
		}
	}

}
