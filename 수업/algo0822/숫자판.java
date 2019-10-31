package algo0822;

import java.util.Scanner;

public class 숫자판 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cnt = 0;
		for(int i = 0; i<n*n; i++) {
			int x = scn.nextInt();
			if(x%2==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
