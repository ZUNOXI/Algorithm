package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 마방진 {
	static int dx = 1;
	static int dy = 1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("마방진의 크기를 입력하시오");
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];			
			
			int x = (n / 2) * -1;	int y = n / 2;
			int idx = 1;
			int dx = 0;	int dy = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					dx = ((x + j) + n) % n;
					dy = ((y + j) + n) % n;
					arr[dx][dy] = idx;
					idx++;
				}
				x = x + 1;
				y = y - 1;
			} 
			
			int resultsum = 0;
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					resultsum = resultsum + arr[i][j];
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
}
