package algo1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 종구의딸이름짓기 {
	static char[][]arr;
	static int N,M;
	static String result;
	static ArrayList<String>list;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int t = Integer.parseInt(s);
		for(int i = 0; i<t; i++) {
			s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			arr = new char[N+2][M+2];
			for(int x = 1; x<N+1; x++) {
				s = br.readLine();
				for(int y = 1; y<M+1; y++) {
					arr[x][y] = s.charAt(y-1);
				}
			}
			list = new ArrayList<>();
			result = "";
//			for(int x = 1; x<N+1; x++) {
//				for(int y = 1; y<M+1; y++) {
//					System.out.print(arr[x][y]+" ");
//				}
//				System.out.println();
//			}
			visited = new boolean[N+2][M+2];
			result = result+arr[1][1];
			dfs(1,1);
//			for(int x = 0; x<list.size(); x++) {
//				System.out.println(list.get(x));
//			}
//			System.out.println();
//			System.out.println(list.size());
			Collections.sort(list, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					return o1.compareTo(o2);
				}
			});
			System.out.println("#"+(i+1)+" "+list.get(0));
		}
		
	}
	static boolean[][]visited;
	static int[] dx = {0,1};
	static int[] dy = {1,0};
	public static void dfs(int a, int b) {
		visited[a][b] = true;
		if(a==N && b==M) {
			list.add(result);
//			System.out.println("나왔다");
		}
		for(int i = 0; i<2; i++) {
			int nx = a + dx[i];
			int ny = b + dy[i];
//			System.out.print(i+"/");
			if(arr[nx][ny]!=0 && !visited[nx][ny]) {
				result = result+arr[nx][ny];
//				System.out.print(arr[nx][ny]+"/");
				dfs(nx,ny);
				String tmp = "";
				for(int j = 0; j<result.length()-1;j++) {
					tmp = tmp + result.substring(j,j+1);
				}
				result = tmp;
				visited[nx][ny]=false;
			}
		}
	}

}
