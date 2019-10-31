package algo1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 재관이의대량할인 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			Integer[]arr = new Integer[n];
			int first = 0;
			int second = 0;
			int result = 0;
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			for(int j=0; j<n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				first = first + arr[j];
			}
			Arrays.sort(arr,Collections.reverseOrder());
			
			for(int j = 2; j<n; j=j+3) {
				second = second + arr[j];
			}
			result = first - second;
			System.out.println("#"+(i+1)+" "+result);
		}
	}

}
