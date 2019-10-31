package SWexpertD2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 숫자를정렬하자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		for(int i = 0; i<tc; i++) {
			int N  = scn.nextInt();
			int [] arr = new int[N];
			for(int j = 0; j<N; j++) {
				arr[j] = scn.nextInt();
			}
			Arrays.sort(arr);
			System.out.print("#"+(i+1)+" ");
			for(int x : arr) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
