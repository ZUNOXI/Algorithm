package SWexpertD2;

import java.util.Scanner;

public class 간단한압축풀기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int N  = scn.nextInt();
			String [] sarr = new String[N];
			int [] narr = new int[N];
			for(int j = 0; j<N; j++) {
				sarr[j] = scn.next();
				narr[j] = scn.nextInt();
			}
			int cnt = 0;
			int cycle = 0;
			System.out.println("#"+(i+1));
			while(cycle<N) {
				for(int x = 0; x<narr[cycle]; x++) {
					System.out.print(sarr[cycle]);
					cnt++;
					if(cnt%10==0) {
						System.out.println();
					}
				}
				cycle++;
			}
			System.out.println();
		}
	}

}
