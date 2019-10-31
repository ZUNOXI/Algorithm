package D3;

import java.util.ArrayList;
import java.util.Scanner;

public class magenetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			int n = scn.nextInt();
			int [][] arr =new int [n][n];
			for(int x = 0; x<n; x++) {
				for(int y = 0; y<n; y++) {
					arr[x][y]=scn.nextInt();
				}
			}
			
			int cntall = 0;
			
			for(int x = 0; x<n; x++) {
				for(int y = 0; y<n; y++) {
					if(arr[x][y]==1) {
						for(int j = x+1; j<n; j++) {
							if(arr[j][y]==1) {
								break;
							}
							if(arr[j][y]==2) {
								cntall++;
								break;
							}
						}
					}
				}
			}
			System.out.println("#"+(i+1)+" "+cntall);
			}
		}
	}
