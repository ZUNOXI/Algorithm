package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 계단오르기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[]arr = new int[n+1];
		for(int i = 1; i<=n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int[]temp = new int[n+1];
		temp[1]=arr[1];
	}

}
