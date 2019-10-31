package algo0729;

import java.util.Scanner;

public class 홀수만구해보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T  = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int sum = 0;
			for(int j = 0; j<10; j++) {
				int a = scn.nextInt();
				if(a%2!=0) {
					sum = sum + a ;
				}
			}
			System.out.println("#"+(i+1)+" "+sum);
			
		}
	}

}
