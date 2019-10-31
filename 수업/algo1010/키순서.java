package algo1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 키순서 {
	static boolean [] visited;
	static int [][] arr;
	static ArrayList<Integer>list;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int t = Integer.parseInt(str);
		for(int i = 0; i<t; i++) {
			String s = br.readLine();
			N = Integer.parseInt(s);
			s = br.readLine();
			int M = Integer.parseInt(s);
			arr = new int[N+2][N+2];
			for(int j = 0; j<M; j++) {
				s = br.readLine();
				StringTokenizer st = new StringTokenizer(s);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr[a][b] = 1;
				arr[b][a] = 1;
			}
			for(int x = 1; x<N+1; x++) {
				for(int y = 1; y<N+1; y++) {
					System.out.print(arr[x][y]);
				}
				System.out.println();
			}
			for(int x = 1; x<N+1; x++) {
				visited = new boolean[N+1];
				list =new ArrayList<>();
				for(int y = 1; y<N+1; y++) {
					if(arr[x][y]==1 && !visited[x]) {
						dfs(x,y);
					}
				}
				System.out.println(list.size());
			}
		}
	}
	
	public static void dfs(int a, int b) {
		visited[a] = true;
		int cnt = 0;
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)==b) {
				cnt++;
			}
		}
		if(cnt==0) {
			list.add(b);
		}
		for(int i = 1; i<N; i++) {
			if(arr[b][i]==1 && !visited[i]) {
				dfs(b,i);
			}
		}
	}

}
