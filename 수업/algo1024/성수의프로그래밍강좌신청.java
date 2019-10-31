package algo1024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 성수의프로그래밍강좌신청 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int N = 0;
		int K = 0;
		double res = 0;
		String s = null;
		int[] arr = null;
		for(int t=1; t<=T; t++) {
			res = 0;
			
			s = br.readLine();
			
			StringTokenizer st = new StringTokenizer(s);
					
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			s = br.readLine();
			st = new StringTokenizer(s);
			arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr);
			for(int i=arr.length-K; i<arr.length; i++) {
				res = (res+arr[i])/2;
			}
			
			System.out.println("#"+t+" "+res+"\n");
		}
	}
}