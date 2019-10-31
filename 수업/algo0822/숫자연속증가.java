package algo0822;

import java.util.Scanner;

public class 숫자연속증가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		int cnt = 1;
		int max = 0;
		for(int i = 0; i<n; i++) {
			if(i+1<n && arr[i]+1==arr[i+1]) {
				cnt++;
			}
			else {
				if(cnt>max) {
					max = cnt;
				}
				cnt=1;
			}
		}
		
		System.out.println(max);
	}	

}
