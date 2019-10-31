package algo1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[]arr = new int[11];
			arr[0]=0;
			arr[1]=1;
			arr[2]=2;
			arr[3]=4;
			for(int j=4; j<=n; j++) {
				arr[j]=arr[j-1]+arr[j-2]+arr[j-3];
			}
			System.out.println(arr[n]);
		}
	}
}
