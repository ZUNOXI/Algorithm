package algo0814;

import java.util.Scanner;

public class 최적경로2 {
	static class Point{
		int x,y;
		Point(int x,int y){
			this.x = x; this.y = y;
		}
	}
	
	static Point company;
	static Point home;
	static Point[] customers;
	static int N;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();//고객의 수
			company = new Point(sc.nextInt(), sc.nextInt());
			home = new Point(sc.nextInt(), sc.nextInt());
			customers = new Point[N];
			for(int i = 0; i < N; i++) {
				customers[i] = new Point(sc.nextInt(), sc.nextInt());
			}
			visited = new boolean[N];
			min = 987654321;
			dfs(company.x, company.y, 0, 0);
			System.out.println("#" + tc + " " + min);
		}
	}
	static int min;
	static void dfs(int x,int y,int dist, int cnt) {
		if( cnt == customers.length ) {
			//다 방문했다. 집가자.
			int tmp = Math.abs(x - home.x) + Math.abs(y - home.y);
			dist += tmp;
			min = Math.min(min, dist);
			return;
		}
		//백트래킹
		if( min < dist )
			return;
		
		for(int i = 0; i < customers.length; i++) {
			
			if( !visited[i] ) {
				visited[i] = true;
				int tmp = Math.abs( x - customers[i].x ) + Math.abs(y - customers[i].y);
				dfs(customers[i].x, customers[i].y, dist + tmp, cnt+1);
				visited[i] = false;
			}
			
		}
		
	}
}





















