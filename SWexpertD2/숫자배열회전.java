package SWexpertD2;

import java.util.Scanner;

public class 숫자배열회전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int n = scn.nextInt();
			int [][] arr = new int[n][n];
			int z = 0;
			for(int x = 0; x<n; x++) {
				for(int y = 0; y<n; y++) {
					arr[x][y] = scn.nextInt();
				}
			}
			int[][]arr90 = new int[n][n];
			int[][]arr180 = new int[n][n];
			int[][]arr270 = new int[n][n];
			
			for(int j = 0; j<3; j++) {
				int X = n;
				int Y = 0;
				
				for(int x = 0; x<n; x++) {
					X = n;
					 for(int y = 0; y<n; y++) {
						 X--;
						 arr90[x][y]=arr[X][Y];
						 
					 }
					 Y++;
				 }
				 
				
				 
				 Y = 0;
				 for(int x = 0; x<n; x++) {
					 X = n;
					 for(int y = 0; y<n; y++) {
						 X--;
						 arr180[x][y]=arr90[X][Y];
						 
					 }
					 Y++;
				 }
				 
				 
				 
				 Y = 0;
				 for(int x = 0; x<n; x++) {
					 X = n;
					 for(int y = 0; y<n; y++) {
						 X--;
						 arr270[x][y]=arr180[X][Y];
						 
					 }
					 Y++;
				 }
			}
			System.out.println("#"+(i+1));
			for(int x = 0; x<n; x++) {
				for(int y = 0; y<n; y++) {
					System.out.print(arr90[x][y]);
				}
				System.out.print(" ");
				for(int y = 0; y<n; y++) {
					System.out.print(arr180[x][y]);
				}
				System.out.print(" ");
				for(int y = 0; y<n; y++) {
					System.out.print(arr270[x][y]);
				}
				System.out.println();
			}
//			System.out.println();
		}
	}
}
