package algo0729;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 중간값찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N  = scn.nextInt();
		int[]arr = new int[N];
		for(int j = 0; j<N; j++) {
			arr[j] = scn.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[N/2]);
	}
}
