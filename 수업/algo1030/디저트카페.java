package algo1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 디저트카페 {
	static int[][]arr;
	static boolean[][]visited;
	static boolean[]check;
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n+2][n+2];
			visited = new boolean[n+2][n+2];
			for(int x = 1; x<n+1; x++) {
				String s = br.readLine();
				StringTokenizer st = new StringTokenizer(s);
				for(int y = 1; y<n+1; y++) {
					arr[x][y] = Integer.parseInt(st.nextToken());
				}
			}
			
//			for(int x = 0; x<n+2; x++) {
//				for(int y = 0; y<n+2; y++) {
//					System.out.print(arr[x][y]);
//				}
//				System.out.println();
//			}
			result = 0;
			for(int x = 1; x<n+1; x++) {
				for(int y = 1; y<n+1; y++) {
					check = new boolean[101];
					visited[x][y]=true;
					check[arr[x][y]]=true;
					fx=x;
					fy=y;
					dfs(x,y,0,1);
					visited[x][y]=false;
					check[arr[x][y]]=false;
				}
			}
			if(result<4) {
				result=-1;
			}
			System.out.println("#"+(i+1)+" "+result);
		}
	}
	static int fx,fy,result;
	static int[]dx= {1,1,-1,-1};
	static int[]dy= {1,-1,-1,1};
	
	public static void dfs(int x, int y, int side, int cnt) {
		if(side==4) {
			return;
		}
		int nx = x+dx[side];
		int ny = y+dy[side];
		if(arr[nx][ny]==0) {
			return;
		}
		if(visited[nx][ny]||check[arr[nx][ny]]) {
//			System.out.println(cnt);
			if(fx==nx&&fy==ny) {
				result = Math.max(result, cnt);
//				System.out.println("??");
			}
			return;
		}
		visited[nx][ny]=true;
		check[arr[nx][ny]]=true;
		dfs(nx,ny,side,cnt+1);
//		System.out.println("????");
		dfs(nx,ny,side+1,cnt+1);
		visited[nx][ny]=false;
		check[arr[nx][ny]]=false;
		}
}
