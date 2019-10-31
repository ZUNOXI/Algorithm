package D3;

import java.util.Scanner;

public class 보충학습과평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int[]arr = new int[5];
			int sum = 0;
			for(int j = 0; j<5; j++) {
				arr[j] = scn.nextInt();
				if(arr[j]<40) {
					arr[j]=40;
				}
				sum = sum + arr[j];
			}
			int avg = sum/5;
			System.out.println("#"+(i+1)+" "+avg);
		}
	}
	
}
