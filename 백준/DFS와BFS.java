package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS {
	public static int nodecnt;
	public static LinkedList<Integer>[]nodelist;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		nodecnt = Integer.parseInt(st.nextToken());
		int linecnt = Integer.parseInt(st.nextToken());
		int startnode = Integer.parseInt(st.nextToken());
		
		nodelist = new LinkedList[nodecnt+1];
		
		for(int i = 0; i<nodecnt+1; i++) {
			nodelist[i] = new LinkedList<Integer>(); 
		}
		
		for(int i = 0; i<linecnt; i++) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			
			nodelist[node1].add(node2);
			nodelist[node2].add(node1);
			
			
			Collections.sort(nodelist[node1]); // 인접한 노드에 더 적은수부터 접근해서 그런건가?
			Collections.sort(nodelist[node2]);
			
		}
		
		StringBuilder dfsresult = new StringBuilder();
		StringBuilder bfsresult = new StringBuilder();
		
		boolean[]dfsvisited = new boolean[nodecnt+1];
		boolean[]bfsvisited = new boolean[nodecnt+1];
		
		dfs(startnode,dfsvisited,dfsresult);
		bfs(startnode,bfsvisited,bfsresult);
		
		System.out.println(dfsresult+"\n"+bfsresult);
		
	}
	public static void dfs(int node,boolean[]visited,StringBuilder sb) {
		if(visited[node]) {
			return;
		}
		visited[node]=true;
		sb.append(node+" ");
		for(int i=0; i<nodelist[node].size(); i++) {
			dfs(nodelist[node].get(i),visited,sb);
		}
//		for(int nextnode : nodelist[node]) {
//			dfs(nextnode,visted,sb);
//		}
	}
	
	public static void bfs(int node,boolean[]visited,StringBuilder sb) {
		Queue<Integer>queue = new LinkedList<>();
		
		queue.offer(node);
		
		while(!queue.isEmpty()) {
			node = queue.poll();
			
			if(visited[node]) {
				continue;
			}
			
			visited[node] = true;
			sb.append(node+" ");
			for(int i = 0; i<nodelist[node].size();i++) {
				queue.add(nodelist[node].get(i));
			}
		}
	}
	
	

}
