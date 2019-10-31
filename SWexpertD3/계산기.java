package SWexpertD3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 계산기 {
	static int n;
	static int [] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			n = scn.nextInt();
			int max = 0;
			int sum = 0 ;
			arr = new int[n];
			for(int j = 0; j<n; j++) {
				int input = scn.nextInt();
				if(sum + input>sum*input) {
					sum = sum + input;
				}
				else {
					sum = sum*input;
				}
			}
			
			System.out.println("#"+(i+1)+" "+sum);
		}
	}
}
