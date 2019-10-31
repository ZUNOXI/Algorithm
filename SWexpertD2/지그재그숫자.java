package SWexpertD2;

import java.util.Scanner;

public class 지그재그숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int n = scn.nextInt();
			int sum = 0;
			for(int j = 1; j<(n+1); j++) {
				if(j%2==0) {
					sum = sum - j;
				}
				else {
					sum = sum + j;
				}
			}
			System.out.println("#"+(i+1)+" "+sum);
		}
	}

}
