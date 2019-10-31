package SWexpertD2;

import java.util.Arrays;
import java.util.Scanner;

public class 중간평균값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int N = scn.nextInt();
		for(int i = 0; i<N; i++) {
			int [] arr = new int [10];
			for(int j = 0; j<10; j++) {
				arr[j] = scn.nextInt();
			}
			Arrays.sort(arr);
			double sum = 0;
			for(int j = 1; j<9; j++) {
				sum = sum + arr[j];
			}
			int avgp = (int)(sum/8);
			double avgs1 = sum/8;
			double avgs = avgs1 - avgp;
//			System.out.println(sum+" "+avgp+" "+avgs+"/"+avgs1);
			if(avgs*10>=5.0) {
				avgp = avgp +1;
			}
			System.out.println("#"+(i+1)+" "+avgp);
		}
	}

}
