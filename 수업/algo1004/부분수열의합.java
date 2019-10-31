package algo1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분수열의합 {
	static int n, k;
	static int [] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr = new int[n];
			s = br.readLine();
			st = new StringTokenizer(s); 
			for(int j = 0; j<n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			result = 0;
			solve(0,0);
			System.out.println("#"+(i+1)+" "+result);
		}
	}
	static int result;
    private static void solve(int idx,int sum) {
        if(sum==k) {
            result++;
            return;
        }
        if(sum>k || idx>=n) {
        	return;
        	}
        solve(idx+1,sum+arr[idx]);
        solve(idx+1,sum);
    }

}
