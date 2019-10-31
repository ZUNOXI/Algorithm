package 기초100제;

import java.util.Arrays;
import java.util.LinkedList;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1, 4}, {3, 4}, {3, 10}};
		int[]res = solution(arr);
		System.out.println(Arrays.toString(res));
	}
	public static int[] solution(int[][] v) {
	        int[] answer = new int[2];
	        
	        LinkedList<point>list = new LinkedList<>();
	        
	        for(int i = 0; i<3; i++) {
	        		int a = v[i][0];
	        		int b = v[i][1];
	        		point p = new point(a, b);
	        		list.add(p);
	        	}
	        
	        int alx = 0;
			int aly = 0;
			
			for(int i = 0; i<3; i++) {
				int z = list.get(i).x;
				int cnt = 0;
				for(int j = 0; j<3; j++) {
					if(z==list.get(j).x) {
						cnt++;
					}
				}
				if(cnt==1) {
					alx = list.get(i).x;
				}
			}
			
			for(int i = 0; i<3; i++) {
				int z = list.get(i).y;
				int cnt = 0;
				for(int j = 0; j<3; j++) {
					if(z==list.get(j).y) {
						cnt++;
					}
				}
				if(cnt==1) {
					aly = list.get(i).y;
				}
			}
			
			answer[0] = alx;
			answer[1] = aly;

	        return answer;
	    }
	
	static class point{
		int x;
		int y;
		public point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}


