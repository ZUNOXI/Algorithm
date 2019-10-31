package algo0814;

import java.util.Scanner;

public class 최적경로 {
	static class Point{
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x; this.y = y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); //고객의 수.
			
			//처음 두개의 숫자가 회사의 좌표..
			Point company = new Point(sc.nextInt(), sc.nextInt());
			//그 다음 두개의 숫자는 집의 좌표..
			Point home = new Point(sc.nextInt(), sc.nextInt());
			
			Point[] customers = new Point[N];
			//그 다음 N*2개의 숫자는 고객들의 좌표
			for(int i = 0; i < N; i++) {
				customers[i] = new Point(sc.nextInt(), sc.nextInt());
			}
			min = 987654321;
			perm(customers, 0, new Point[N], new boolean[N], company, home);
			System.out.println("#" + tc + " " + min);
		}
	}
	static int min = 987654321;
	static void perm(Point[] customers, int idx, Point[] result, boolean[] visited, Point company, Point home) {
		if( idx == result.length ) {
			int dist = 0;
			dist += (Math.abs(company.x - result[0].x) + Math.abs(company.y - result[0].y));
			for(int i = 1; i < result.length; i++) {
				dist += (Math.abs(result[i-1].x - result[i].x) 
						+ Math.abs(result[i-1].y - result[i].y));
			}
			dist += (Math.abs(result[result.length-1].x - home.x) 
					+ Math.abs(result[result.length-1].y - home.y));
//			System.out.println(dist);
			min = Math.min(min, dist);
			return;
		}
		for(int i = 0; i < customers.length; i++) {
			if( !visited[i] ) {
				result[idx] = customers[i];
				visited[i] = true;
				perm(customers, idx+1, result, visited, company, home);
				visited[i] = false;
			}
		}
	}
}

























