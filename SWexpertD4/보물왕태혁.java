package D4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 보물왕태혁 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int tc = scn.nextInt();
			int[]arr = new int[tc];
			int N = 0;
			for(int j = 0; j<tc; j++) {
				arr[j]=scn.nextInt();
			}
			Arrays.sort(arr);
			if(tc==1) {
				N = arr[0]*arr[0];
			}
			else {
				N = arr[0]*arr[tc-1];
			}
			System.out.println("#"+(i+1)+" "+N);
		}
	}

}
