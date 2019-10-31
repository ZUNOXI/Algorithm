package algo0925;

import java.util.Scanner;

public class 배낭문제_메모 {
	static int N;
	static int K;
	static int[] weights;
	static int[] values;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			weights = new int[N];
			values = new int[N];
			
			for(int i = 0; i < N; i++) {
				weights[i] = sc.nextInt();
				values[i] = sc.nextInt();
			}
		}
	}
	//상태는 검사중인 아이템의 번호, 지금까지 무게, 지금까지 가치
	static void dfs(int idx, int weight, int value) {
		if(idx == N) {
			return;
		}
		dfs(idx+1, weight, value);
		dfs(idx+1, weight + weights[idx], value + values[idx]);
		
	}
}
