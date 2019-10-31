package algo0925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Knapsack {
	
	static long max;
	static int N,K;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++) {
			max = 0;
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			int[][]arrx = new int[N+1][K+1];
			prod [] arr = new prod[N+1];
			for(int j = 1; j<=N; j++) {
				str = br.readLine();
				st = new StringTokenizer(str);
				int v = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				arr[j] = new prod(v, c);
			}
			for(int j = 1; j<N+1; j++) {
				for(int x = 1; x<K+1; x++) {
					if(arr[j].weight>x) {
						arrx[j][x] = arrx[j-1][x];
					}
					else {
						arrx[j][x] = Max(arr[j].profit+arrx[j-1][x-arr[j].weight],arrx[j-1][x]);
					}
				}
			}
			System.out.println("#"+(i+1)+" "+arrx[N][K]);
		}
	}
	
	static int Max(int a, int b) {
		return a>b?a:b;
	}
}

class prod{
	int weight;
	int profit;
	prod(int a, int b){
		this.weight = a;
		this.profit = b;
	}
}
