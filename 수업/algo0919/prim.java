package algo0919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class prim {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		ArrayList<point>[]arr = new ArrayList[V];
		
		for(int i = 0; i<V; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i<E; i++) {
			s = br.readLine();
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[a].add(new point(b,c));
			arr[b].add(new point(a,c));
		}
		
		// 선택된 정점이 모여있는 곳
		ArrayList<Integer> selList = new ArrayList<>();
		// 선택되 정점을 표시하는 체크배열
		boolean [] visited = new boolean[V];
		
		selList.add(0);
		visited[0] =true;
		
		int result = 0;
		
		while(selList.size()<V) {
			int min = 954357496;
			int minV = -1;
			for( int v : selList) {
				for(int i = 0; i<arr[v].size(); i++) {
					point p = arr[v].get(i);
					if( !visited[p.root] && min>p.cost) {
						min = p.cost;
						minV = p.root;
					}
				}
			}
			
			visited[minV] = true;
			selList.add(minV);
			result = result + min;
		}
		
		System.out.println(result);
		}
	
	public static class point{
		int root;
		int cost;
		public point(int x, int y) {
			this.root = x;
			this.cost = y;
		}
	}

}
