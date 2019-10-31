package algo0919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dijkstra {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[V][V];
		for(int i = 0; i<E; i++) {
			s = br.readLine();
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[a][b] = c;
		}
		
		int[]dist = new int[V];
		boolean[] visited = new boolean[V];
		visited[0] = true;
		
		for(int i = 0; i<V; i++) {
			dist[i] = arr[0][i];
			if(arr[0][i]==0) {
				dist[i] = 999;
			}
		}
		
		dist[0] = 0;
		for(int i = 0; i<V-1; i++) {
			int minIdx = 0;
			int min = 999;
			for(int j = 0; j<V; j++) {
				if(! visited[j] && min>dist[j]) {
					minIdx = j;
					min = dist[j];
				}
			}
			
			for(int j = 0; j<V; j++) {
				if( arr[min][j] != 0 && dist[min] + arr[min][j] < dist[j]) {
					dist[j] = dist[min]+arr[min][j];
				}
			}
			visited[minIdx] = true;
			System.out.println(Arrays.toString(dist));
			
		}
	}

}
