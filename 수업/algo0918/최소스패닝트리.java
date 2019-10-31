package algo0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 최소스패닝트리 {
	static int [][] arr;
	static int [] arrp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str = br.readLine();
		 int tc = Integer.parseInt(str);
		 for(int i = 0; i<tc; i++) {
			 String s = br.readLine();
			 StringTokenizer st = new StringTokenizer(s);
			 int V = Integer.parseInt(st.nextToken());
			 int E = Integer.parseInt(st.nextToken());
			 
			 arr = new int[E][3];
			 for(int j = 0; j<E; j++) {
				 s = br.readLine();
				 st = new StringTokenizer(s);
				 arr[j][0] = Integer.parseInt(st.nextToken());
				 arr[j][1] = Integer.parseInt(st.nextToken());
				 arr[j][2] = Integer.parseInt(st.nextToken());
			 }
			 
			 arrp = new int[V+1];
			 for(int j = 1; j<=V; j++) {
				 arrp[j] = j;
			 }
			 
			Arrays.sort(arr, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return Integer.compare(o1[2], o2[2]);
				}
			});
			int cnt = 0;
			long result = 0;
			
			for(int j = 0; j<E; j++) {
				if((find(arr[j][0]))!=(find(arr[j][1]))){
					cnt++;
					result = result + arr[j][2];
					union(arr[j][0],arr[j][1]);
					if(cnt==(V-1)) {
						break;
					}
				}
			}
			System.out.println("#"+(i+1)+" "+result);
		 } 
	}
	
	public static int find(int x) {
		if(x == arrp[x]) {
			return x;
		}
		arrp[x] = find(arrp[x]);
		return arrp[x];
	}
	
	
	public static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		arrp[px] = py;
	}
}
