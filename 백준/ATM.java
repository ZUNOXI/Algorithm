package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n+1];
		for(int i = 1; i<n+1; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		for(int i = 1; i<n+1; i++) {
			int sump = 0;
			for(int j = 1; j<=i; j++) {
				sump = sump + arr[j];
			}
			sum = sum + sump;
		}
		System.out.println(sum);
	}
}
