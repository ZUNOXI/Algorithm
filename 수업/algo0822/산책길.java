package algo0822;

import java.util.Scanner;

public class 산책길 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		int cnt = 0;
		for(int i = 1; i<n-1; i++) {
			if(arr[i]>arr[i-1] && arr[i]<arr[i+1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
