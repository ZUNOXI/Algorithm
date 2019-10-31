package algo0904;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 인접행렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c = scn.nextInt();
		int [][] arr = new int[n+1][n+1];
		for(int i = 0; i<c; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		boolean [] visited = new boolean[n+1];
		Queue<Integer>queue = new
				LinkedList<>();
		queue.add(1);
		visited[1] = true;
		while(!(queue.isEmpty())) {
			int node = queue.poll();
			System.out.print(node+" ");
			for(int i = 0; i<n+1; i++) {
				if(arr[node][i] == 1 && !visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
//		for(int x = 0; x<=n; x++) {
//			for(int y = 0; y<=n; y++) {
//				System.out.print(arr[x][y]+" ");
//			}
//			System.out.println();
//		}
	}
}
