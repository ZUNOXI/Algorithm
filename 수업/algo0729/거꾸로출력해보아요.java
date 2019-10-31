package algo0729;

import java.util.Scanner;

public class 거꾸로출력해보아요 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N  = scn.nextInt();
		int n = N;
		for(int i = 0; i<N+1; i++) {
			System.out.print(n);
			System.out.print(" ");
			n--;
		}
	}

}
