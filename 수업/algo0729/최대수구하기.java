package algo0729;

import java.util.Arrays;
import java.util.Scanner;

public class 최대수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int[]arr = new int[10];
			for(int j = 0; j<10; j++) {
				arr[j]=scn.nextInt();
			}
			Arrays.sort(arr);
			System.out.println("#"+(i+1)+" "+arr[9]);
		}
	}

}
