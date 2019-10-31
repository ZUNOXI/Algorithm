package SWexpertD2;

import java.util.Scanner;

public class 백만장자프로젝츠 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int N  = scn.nextInt();
			int [] arr = new int [N];
			for(int j = 0; j<N; j++) {
				arr[j]=scn.nextInt();
			}
			long totalsum = 0;
			int first = 0;
			int last = 0;
			long max = 0;
			long sum = 0;
			
			while(last!=N) {
				max = 0;
				for(int j = first; j<N; j++) {
					if(arr[j]>max) {
						max = arr[j];
						last = j + 1;
					}
				}
				for(int j = first; j<last; j++) {
					totalsum = totalsum + (max-arr[j]);
				}
				first = last;
			}
			
//			for(int j = 0; j<N; j++) {
//				long max = 0;
//				for(int x = j; x<N; x++) {
//					long sum = 0;
//					if(arr[j]<arr[x]) {
//						sum = arr[x]-arr[j];
//						if(sum>max) {
//							max = sum;
//						}
//					}
//				}
//				totalsum = totalsum + max;
			System.out.println("#"+(i+1)+" "+totalsum);
		}
	}

}
