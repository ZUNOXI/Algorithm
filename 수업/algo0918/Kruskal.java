package algo0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.InputMap;




public class Kruskal{
	static class point{
		int a;
		int b;
		int cost;
		public point(int a, int b, int cost) {
			this.a = a;
			this.b = b;
			this.cost = cost;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		LinkedList<point>list = new LinkedList<>();
		
		for(int i = 0; i<M; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken()); 
			int cost = Integer.parseInt(st.nextToken());
			point p = new point(a, b, cost);
			list.add(p);
		}
		
		int [] arr = new int[]
		
		Collections.sort(list, new Comparator<point>() {
			@Override
			public int compare(point o1, point o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		for(int i = 0; i< list.size(); i++) {
			union(list.get(i).a,list.get(i).b);
		}
		
	}
	
	public static int find(int x) {
		return 0;
	}

	public static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		
	}

	
	
	
}
