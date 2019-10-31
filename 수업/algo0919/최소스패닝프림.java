package algo0919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class 최소스패닝프림 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int tc = Integer.parseInt(s);
		for(int j = 0; j<tc; j++) {
			s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			ArrayList<point>[]arr = new ArrayList[V+1];
			
			for(int i = 1; i<=V; i++) {
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
			PriorityQueue<point> pq =  new PriorityQueue<>();
			
			boolean [] visited = new boolean[V+1];
			int cnt = 1;
			visited[1] = true;
			long result = 0;
			pq.addAll(arr[1]);
			while(cnt<V) {
				point p = pq.poll();
				if(visited[p.root]) {
					continue;
				}
				pq.addAll(arr[p.root]);
				visited[p.root] = true;
				cnt++;
				result = result + p.cost;
			}
			
			System.out.println("#"+(j+1)+" "+result);
			}
		}
	
	public static class point implements Comparable<point>{
		int root;
		int cost;
		public point(int x, int y) {
			this.root = x;
			this.cost = y;
		}
		@Override
		public int compareTo(point o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.cost, o.cost);
		}
	}

}
