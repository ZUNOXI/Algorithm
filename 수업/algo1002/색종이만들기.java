package algo1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이만들기 {
	static int count0 = 0; 
	static int count1 = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] square = new int[n][n]; 
		for (int i = 0; i < n; i++) { 
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			for (int j = 0; j < n; j++) { 
				square[i][j] = Integer.parseInt(st.nextToken());
				} 
			}
		check(square, 0, 0, n); System.out.println(count0); System.out.println(count1);
		
	}
	public static void check(int[][] square, int x1, int y1, int n) {
		int value = square[x1][y1];
		
		if (n == 1) {
			if (value == 0) {
				count0++; 
				} 
			else {
				count1++; 
				} 
			return; 
			} 
		boolean isOne = true;
		
		for (int i = x1; i < x1 + n; i++) {
			for (int j = y1; j < y1 + n; j++) { 
				if (value != square[i][j]) {
					isOne = false;
					break; 
					} 
				}
			if (!isOne) {
				break; 
				} 
			} 
		
		if (isOne) { 
			if (value == 0) {
				count0++;
				}
			else {
				count1++; 
				} 
			return; 
			} 
		
		else {
			check(square, x1, y1, n / 2);
			check(square, x1 + n / 2, y1, n / 2); 
			check(square, x1, y1 + n / 2, n / 2);
			check(square, x1 + n / 2, y1 + n / 2, n / 2); 
			} 
		}
	
	}
