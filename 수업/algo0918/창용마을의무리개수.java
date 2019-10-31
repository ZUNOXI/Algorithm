package algo0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 창용마을의무리개수 {
	static int [] arr;
	static int N,M;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int tc = Integer.parseInt(s);
		for(int i = 0; i<tc; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			arr = new int[N+1];
			for(int j = 1; j<=N; j++) {
				arr[j] = j;
			}
			for(int j = 0; j<M; j++) {
				str = br.readLine();
				st = new StringTokenizer(str);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				union(a,b);
			}
			int cnt=0;
			for(int j =1; j<=N; j++) {
				if(j==arr[j]) {
					cnt++;
				}
			}
			System.out.println("#"+(i+1)+" "+cnt);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static int find(int x) {
		if(x==arr[x]) {
			return x;
		}
		arr[x] = find(arr[x]);
		return arr[x];
	}
	
	public static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		arr[px] = py;
	}

}
