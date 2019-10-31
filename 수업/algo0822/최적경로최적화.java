package algo0822;

import java.util.Scanner;

public class 최적경로최적화 {
	static class Point{
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x; this.y = y;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int tc = 1; tc <=T; tc++) {
			int N = scn.nextInt(); //고객의 수
			
			// 처음 두개의 숫자가 회사의 좌표, 그 다음은 집의 좌표
			Point company = new Point(scn.nextInt(),scn.nextInt());
			Point home = new Point(scn.nextInt(),scn.nextInt());
			
			Point[] customers = new Point[N];
			// 그 다음 N*2개의 숫자는 고객들의 좌표
			for(int i = 0; i<N; i++) {
				customers[i] = new Point(scn.nextInt(), scn.nextInt());
			}
			
			int dist = 0;
			dist += (Math.abs(company.x -customers[0].x)+Math.abs(company.y -customers[0].y));
			// 0번에서 1번 ~~ n-1번 ~
			
		}
	}

}
