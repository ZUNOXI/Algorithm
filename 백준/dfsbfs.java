package 백준;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.xml.soap.Node;

public class dfsbfs {
	public static int nodecnt;
	public static LinkedList<Integer>[]nodelist ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		nodecnt = Integer.parseInt(st.nextToken());
		int linecnt = Integer.parseInt(st.nextToken());
		int startnode = Integer.parseInt(st.nextToken());
		
		nodelist = new LinkedList[nodecnt+1];
		
		for(int i = 0; i<nodecnt; i++) {
			nodelist[i] = new LinkedList<>();
		}
		
		for(int i = 0; i<linecnt; i++) {
			st = new StringTokenizer(br.readLine());
			
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			
			nodelist[node1].add(node2);
			nodelist[node2].add(node1);
			
			Collections.sort(nodelist[node1]);
			Collections.sort(nodelist[node2]);
		}
		
		StringBuilder dfsResult = new StringBuilder();
		StringBuilder bfsResult = new StringBuilder();
		
		boolean[]dfsVisited = new boolean[nodecnt+1];
		boolean[]bfsVisited = new boolean[nodecnt+1];
		
		dfs(startnode,dfsVisited,dfsResult);
		bfs(startnode,bfsVisited,bfsResult);
		
		System.out.println(dfsResult + "\n" + bfsResult);
		
	}
	
	public static void dfs(int node, boolean[] visited, StringBuilder sb) {
		if(visited[node]) return;
		
	}

}
