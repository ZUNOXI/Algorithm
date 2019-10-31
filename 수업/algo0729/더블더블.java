package algo0729;

import java.util.Scanner;

public class 더블더블 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N  = scn.nextInt();
		int n = 1;
		for(int i = 1; i<N+2; i++) {
			System.out.print(n);
			System.out.print(" ");
			n = n * 2;
		}
	}

}
